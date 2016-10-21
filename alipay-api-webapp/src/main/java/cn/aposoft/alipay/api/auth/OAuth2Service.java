/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.auth;

import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserUserinfoShareResponse;

/**
 * 用户授权服务
 * 
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public interface OAuth2Service {

    /**
     * 获取用户授权的redirect的URL
     * 
     * @return url 重定向URL
     */
    String getRedirectUrl(String redirectUri, String scope);

    /**
     * 读取回调地址
     * 
     * @param redirectUri
     *            支付宝回调地址
     * @param scope
     *            授权用户信息范围
     * @param state
     *            本次请求随机数状态
     * @return url 重定向URL
     */
    String getRedirectUrl(String redirectUri, String scope, String state);

    /**
     * 获取Access_token 授权方式:authorization_code
     * 
     * @throws AlipayApiException
     */
    AlipaySystemOauthTokenResponse getAccessToken(String code, String state) throws AlipayApiException;

    /**
     * 获取Access_token 授权方式:refresh_token
     * 
     * @param refresh_token
     *            使用refresh_token 获取access_token
     * @throws AlipayApiException
     */
    AlipaySystemOauthTokenResponse getAccessToken(String refresh_token) throws AlipayApiException;

    /**
     * 读取 用户基本信息
     * 
     * @param accessToken
     *            授权token
     * @return 用户信息对象
     * @throws AlipayApiException
     */
    AlipayUserUserinfoShareResponse getUserInfo(String accessToken) throws AlipayApiException;

}
