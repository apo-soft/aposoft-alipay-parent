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
     * @return url
     */

    String getRedirectUrl(String redirectUri, String scope);
}
