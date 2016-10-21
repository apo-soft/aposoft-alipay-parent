/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.auth;

/**
 * 值为authorization_code时，代表用code换取；值为refresh_token时，代表用refresh_token换取
 * 
 * @author LiuJian
 * @date 2016年10月21日
 * 
 */
public enum GrantType {
    /**
     * 
     */
    authorization_code("authorization_code"),
    /**
     * 
     */
    refresh_token("refresh_token");
    /*
     * 
     * @param grantType 阿里access_token请求类型
     */
    private GrantType(String key) {
        this.key = key;
    }

    private String key;

    public String getKey() {
        return key;
    }
}
