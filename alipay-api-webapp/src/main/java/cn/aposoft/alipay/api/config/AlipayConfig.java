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
     * 私钥
     * 
     */
    public String getPrivateKey();

    /**
     * AES Key
     */
    public String getAesKey();
    /**
     * 支付宝的商户公钥
     * MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB
     * @return
     */
    public String getAlipayPublicKey();

}
