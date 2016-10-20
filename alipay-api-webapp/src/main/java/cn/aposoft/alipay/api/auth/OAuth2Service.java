/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.auth;

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
}
