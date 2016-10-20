/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.auth;

/**
 * AccessToken 请求返回值
 * 
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public interface AlipaySystemOauth2AccessToken {
    public void setAccessToken(String accessToken);

    public String getAccessToken();

    public void setAlipayUserId(String alipayUserId);

    public String getAlipayUserId();

    public void setExpiresIn(String expiresIn);

    public String getExpiresIn();

    public void setReExpiresIn(String reExpiresIn);

    public String getReExpiresIn();

    public void setRefreshToken(String refreshToken);

    public String getRefreshToken();

    public void setUserId(String userId);

    public String getUserId();
}
