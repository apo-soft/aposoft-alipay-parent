/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.config;

/**
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public interface AlipayConfig {
    /**
     * 应用ID
     * 
     * @return
     */
    public String getAppId();

    /**
     * 公钥
     */
    public String getPublicKey();

    /**
     * AES Key
     */
    public String getAesKey();
}
