/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.config.impl;

import cn.aposoft.alipay.api.config.AlipayConfig;

/**
 * 阿里配置基本信息
 * 
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class AlipayConfigFactory {
    private static final AlipayConfig config = new BasicAlipayConfig();

    /**
     * 
     * @return 阿里配置基本信息
     */
    public static final AlipayConfig getConfig() {
        return config;
    }
}
