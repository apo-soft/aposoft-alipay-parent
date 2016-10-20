/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.auth.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang.RandomStringUtils;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;

import cn.aposoft.alipay.api.auth.OAuth2Service;
import cn.aposoft.alipay.api.config.impl.AlipayConfigFactory;
import cn.aposoft.constant.Lexical;
import cn.aposoft.util.URLEncoder;

/**
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class BasicOAuth2Service implements OAuth2Service {
    // https://www.aposoft.cn/alipay/auth

    // https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?
    // app_id=2016072800108741&scope=auth_base
    // &state=1385224294992388
    // &redirect_uri=https%3A%2F%2Fwww.aposoft.cn%2Falipay%2Foauth2%2Faccess_token%2F
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

        String alipayRedirectUrl = String.format("%s" + "app_id=%s" + "&scope=%s" + "&state=%s" + "&redirect_uri=%s" //
                , cn.aposoft.alipay.api.config.UrlConstant.OAUTH2_URL // 授权URL地址
                , AlipayConfigFactory.getConfig().getAppId() // 公众号ID
                , scope // 应用授权作用域，snsapi_base
                // （不弹出授权页面，直接跳转，只能获取用户openid），snsapi_userinfo
                // （弹出授权页面，可通过openid拿到昵称、性别、所在地。并且，即使在未关注的情况下，只要用户授权，也能获取其信息）
                // snsapi_login 网页登录，或app登录
                , state, encodedUri // 重定向地址
        ); // nonce 无意义随机字符串

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

    @Override
    public String getAccessToken(String code, String state) {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", AlipayConfigFactory.getConfig().getAppId(),
                AlipayConfigFactory.getConfig().getPrivateKey(), Lexical.JSON, Lexical.UTF8, AlipayConfigFactory.getConfig().getPublicKey());
        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
        request.setCode("code");
        request.setGrantType("authorization_code");
        try {
            AlipaySystemOauthTokenResponse oauthTokenResponse = alipayClient.execute(request);
            System.out.println(oauthTokenResponse.getAccessToken());
        } catch (AlipayApiException e) {
            // 处理异常
            e.printStackTrace();
        }
        return null;
    }
}
