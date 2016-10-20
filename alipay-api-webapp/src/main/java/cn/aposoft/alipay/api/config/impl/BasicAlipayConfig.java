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

    /**
     * 私有KEY
     */
    @Override
    public String getPrivateKey() {
        return "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKzVv1+lyTmTtifo" + "gmZwMxJycuk1S2QNd4fkmnR20m1U+0YmumRCLwk2BPGedPceyt8NJifczh4LGIdw"
                + "+Ah/60M+212vou0OzPMQSlntVKm68t/W0sMipVowt/bHUxd+QMLA2xcSFiouQQku"
                + "aELJ7SKmzBch8qt9B+C/WYYJvFQHAgMBAAECgYB7myqQpypwSRmfFQQdauS7rqpL"
                + "6teOKKtxvqZP4KLBmmNSWmQ3S7YD6mRCwMZ57cW9G9RL8fhfOCREySA6Q/HmKrH8"
                + "tOhncl4nIH1SBUrAeudKTeQIBw/jGeoCmnDkdpkNGmUeQDJlLFHsJRKXW4vmzYTg"
                + "nbnteXWSXXDH8SdbcQJBANsHRcYABNK9jF2yyi/EmEXg8kVNMXcf5j1l6Gt33mgM"
                + "+4QoBxrGWDyS65cjE8YdnzuMkaKd96WZic9tPkI4TLsCQQDKAlkiSs31ZWV1sHF0"
                + "zkqlPAWYLCs4aAuKpG4MkuyUOORq7YuHfe7bBKQGao0+PDyBLIvJRXULNEqTqjoz"
                + "jmclAkAH1Je6/28stZgaFXVDBe1HukYPEjZtgtdxZH5NsUhjQeuQCvpOC79F0x7X"
                + "FWr0j0SNFXZzcOBUrEuP/eDW7zpXAkEAutv9M1latpo6hejWqiOArOOekSqaOC0W"
                + "MAL1wS/PIzSVJcvh+00kOvhJ+Z1qVZ1Gon5gN6fGIr0WFw2plLMu+QJBAIVRiwcx"
                + "xbygg/dvpt16rFvbHfsbDZKsjpMU6Va/HQjSTsoHYuq9SvSIl84Z7KWKyoYbVQJT" + "2atOrD7l5ep4zno=";
    }

}
