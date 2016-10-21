/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.config.impl;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

import cn.aposoft.alipay.api.config.AlipayConfig;

/**
 * 沙箱测试应用
 * 
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class BasicAlipayConfig implements AlipayConfig {
    /**
     * pkcs8 格式私钥
     */
    private volatile String pkcs8PrivateKey = null;
    private volatile String publicKey = null;

    /*
     * 沙箱测试应用 (non-Javadoc)
     * 
     * @see cn.aposoft.alipay.api.config.AlipayConfig#getAppId()
     */
    @Override
    public String getAppId() {
        return "2016072800108741";
    }

    /*
     * (non-Javadoc)
     * 
     * @see cn.aposoft.alipay.api.config.AlipayConfig#getPublicKey()
     */
    @Override
    public String getPublicKey() {
        if (publicKey == null) {
            synchronized (this) {
                try {
                    publicKey = IOUtils.toString(this.getClass().getClassLoader().getResourceAsStream("rsa_public_key.pem"));
                    publicKey = publicKey.substring("-----BEGIN PUBLIC KEY-----\n".length(),
                            publicKey.length() - 1 - "\n-----END PUBLIC KEY-----".length());

                } catch (IOException e) {
                    throw new Error("read private key error.");
                }
            }
        }
        return publicKey;
    }

    /*
     * (non-Javadoc)
     * 
     * @see cn.aposoft.alipay.api.config.AlipayConfig#getAesKey()
     */
    @Override
    public String getAesKey() {
        return "hKev5ZZYIYWVJ7MOpaRCqA==";
    }

    /**
     * 私有KEY
     * 
     * @throws IOException
     */
    @Override
    public String getPrivateKey() {
        if (pkcs8PrivateKey == null) {
            synchronized (this) {
                try {
                    pkcs8PrivateKey = IOUtils.toString(this.getClass().getClassLoader().getResourceAsStream("rsa_private_key_pkcs8.pem"));
                    pkcs8PrivateKey = pkcs8PrivateKey.substring("-----BEGIN PRIVATE KEY-----\n".length(),
                            pkcs8PrivateKey.length() - "\n-----END PRIVATE KEY-----".length() - 1);

                } catch (IOException e) {
                    throw new Error("read private key error.");
                }
            }
        }
        return pkcs8PrivateKey;
    }

    @Override
    public String getAlipayPublicKey() {
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
    }

}
