/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.auth.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang.RandomStringUtils;

import cn.aposoft.alipay.api.auth.OAuth2Service;
import cn.aposoft.alipay.api.config.impl.AlipayConfigFactory;
import cn.aposoft.util.URLEncoder;

/**
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class BasicOAuth2Service implements OAuth2Service {
    public static final String OAUTH2_URL_TEMPLATE = "app_id=%s&scope=%s&state=%s&redirect_uri=%s";
    private final ConcurrentMap<String, Object> stateSet = new ConcurrentHashMap<>();

    @Override
    public String getRedirectUrl(String redirectUri, String scope) {
        final String state = getRandomState();
        return getRedirectUrl(redirectUri, scope, state);
    }

    @Override
    public String getRedirectUrl(String redirectUri, String scope, String state) {
        final String encodedUri = URLEncoder.encode(redirectUri);

        String alipayRedirectUrl = String.format("%s" + "appid=%s" + "&redirect_uri=%s" + "&scope=%s" + "&state=%s#wechat_redirect"//
                , cn.aposoft.alipay.api.config.UrlConstant.OAUTH2_URL // 授权URL地址
                , AlipayConfigFactory.getConfig().getAppId() // 公众号ID
                , encodedUri // 重定向地址
                , scope // 应用授权作用域，snsapi_base
                        // （不弹出授权页面，直接跳转，只能获取用户openid），snsapi_userinfo
                        // （弹出授权页面，可通过openid拿到昵称、性别、所在地。并且，即使在未关注的情况下，只要用户授权，也能获取其信息）
                        // snsapi_login 网页登录，或app登录
                , state); // nonce 无意义随机字符串

        return alipayRedirectUrl;
    }

    public String getRandomState() {
        boolean isSet = true;
        do {
            // 生成16位随机字符串
            String nonce = RandomStringUtils.randomNumeric(16);
            Object prevObj = stateSet.putIfAbsent(nonce, nonce);
            if (prevObj != null) {
                isSet = true;
            }
            return nonce;
        } while (isSet);
    }
}
