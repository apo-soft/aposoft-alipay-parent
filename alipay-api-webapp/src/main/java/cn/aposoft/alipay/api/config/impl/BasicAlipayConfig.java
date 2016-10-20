/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.config.impl;

import cn.aposoft.alipay.api.config.AlipayConfig;

/**
 * 沙箱测试应用
 * 
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class BasicAlipayConfig implements AlipayConfig {

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
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCs1b9fpck5k7Yn6IJmcDMScnLpNUtkDXeH5Jp0dtJtVPtGJrpkQi8JNgTxnnT3HsrfDSYn3M4eCxiHcPgIf+tDPttdr6LtDszzEEpZ7VSpuvLf1tLDIqVaMLf2x1MXfkDCwNsXEhYqLkEJLmhCye0ipswXIfKrfQfgv1mGCbxUBwIDAQAB";

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

    @Override
    public String getPrivateKey() {
        // TODO Auto-generated method stub
        return null;
    }

}
