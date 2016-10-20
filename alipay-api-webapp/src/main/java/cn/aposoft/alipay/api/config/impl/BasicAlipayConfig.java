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
        return "-----BEGIN PUBLIC KEY-----" + "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCs1b9fpck5k7Yn6IJmcDMScnLp"
                + "NUtkDXeH5Jp0dtJtVPtGJrpkQi8JNgTxnnT3HsrfDSYn3M4eCxiHcPgIf+tDPttd"
                + "r6LtDszzEEpZ7VSpuvLf1tLDIqVaMLf2x1MXfkDCwNsXEhYqLkEJLmhCye0ipswX" + "IfKrfQfgv1mGCbxUBwIDAQAB" + "-----END PUBLIC KEY-----";
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
        return pkcs8PrivateKey;
    }

    @SuppressWarnings("unused")
    private String pkcs8PrivateKey = "-----BEGIN PRIVATE KEY-----" + "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKzVv1+lyTmTtifo"
            + "gmZwMxJycuk1S2QNd4fkmnR20m1U+0YmumRCLwk2BPGedPceyt8NJifczh4LGIdw" + "+Ah/60M+212vou0OzPMQSlntVKm68t/W0sMipVowt/bHUxd+QMLA2xcSFiouQQku"
            + "aELJ7SKmzBch8qt9B+C/WYYJvFQHAgMBAAECgYB7myqQpypwSRmfFQQdauS7rqpL" + "6teOKKtxvqZP4KLBmmNSWmQ3S7YD6mRCwMZ57cW9G9RL8fhfOCREySA6Q/HmKrH8"
            + "tOhncl4nIH1SBUrAeudKTeQIBw/jGeoCmnDkdpkNGmUeQDJlLFHsJRKXW4vmzYTg" + "nbnteXWSXXDH8SdbcQJBANsHRcYABNK9jF2yyi/EmEXg8kVNMXcf5j1l6Gt33mgM"
            + "+4QoBxrGWDyS65cjE8YdnzuMkaKd96WZic9tPkI4TLsCQQDKAlkiSs31ZWV1sHF0" + "zkqlPAWYLCs4aAuKpG4MkuyUOORq7YuHfe7bBKQGao0+PDyBLIvJRXULNEqTqjoz"
            + "jmclAkAH1Je6/28stZgaFXVDBe1HukYPEjZtgtdxZH5NsUhjQeuQCvpOC79F0x7X" + "FWr0j0SNFXZzcOBUrEuP/eDW7zpXAkEAutv9M1latpo6hejWqiOArOOekSqaOC0W"
            + "MAL1wS/PIzSVJcvh+00kOvhJ+Z1qVZ1Gon5gN6fGIr0WFw2plLMu+QJBAIVRiwcx" + "xbygg/dvpt16rFvbHfsbDZKsjpMU6Va/HQjSTsoHYuq9SvSIl84Z7KWKyoYbVQJT"
            + "2atOrD7l5ep4zno=" + "-----END PRIVATE KEY-----";
    @SuppressWarnings("unused")
    private String privateKey = "MIICXQIBAAKBgQCs1b9fpck5k7Yn6IJmcDMScnLpNUtkDXeH5Jp0dtJtVPtGJrpk"
            + "Qi8JNgTxnnT3HsrfDSYn3M4eCxiHcPgIf+tDPttdr6LtDszzEEpZ7VSpuvLf1tLD" + "IqVaMLf2x1MXfkDCwNsXEhYqLkEJLmhCye0ipswXIfKrfQfgv1mGCbxUBwIDAQAB"
            + "AoGAe5sqkKcqcEkZnxUEHWrku66qS+rXjiircb6mT+CiwZpjUlpkN0u2A+pkQsDG" + "ee3FvRvUS/H4XzgkRMkgOkPx5iqx/LToZ3JeJyB9UgVKwHrnSk3kCAcP4xnqAppw"
            + "5HaZDRplHkAyZSxR7CUSl1uL5s2E4J257Xl1kl1wx/EnW3ECQQDbB0XGAATSvYxd" + "ssovxJhF4PJFTTF3H+Y9Zehrd95oDPuEKAcaxlg8kuuXIxPGHZ87jJGinfelmYnP"
            + "bT5COEy7AkEAygJZIkrN9WVldbBxdM5KpTwFmCwrOGgLiqRuDJLslDjkau2Lh33u" + "2wSkBmqNPjw8gSyLyUV1CzRKk6o6M45nJQJAB9SXuv9vLLWYGhV1QwXtR7pGDxI2"
            + "bYLXcWR+TbFIY0HrkAr6Tgu/RdMe1xVq9I9EjRV2c3DgVKxLj/3g1u86VwJBALrb" + "/TNZWraaOoXo1qojgKzjnpEqmjgtFjAC9cEvzyM0lSXL4ftNJDr4SfmdalWdRqJ+"
            + "YDenxiK9FhcNqZSzLvkCQQCFUYsHMcW8oIP3b6bdeqxb2x37Gw2SrI6TFOlWvx0I" + "0k7KB2LqvUr0iJfOGeylisqGG1UCU9mrTqw+5eXqeM56";

}
