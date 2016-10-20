/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.config.impl;

import cn.aposoft.alipay.api.config.AlipayConfig;

/**
 * https://openhome.alipay.com/platform/appDaily.htm?tab=account
 * <pre>
 * 商家信息
        商家账号 leeikx5023@sandbox.com
        商户UID 2088102168828611
        登录密码 111111
        
    买家信息
        买家账号 kartcp1400@sandbox.com
        账号名称 沙箱买家测试账号
        登录密码 111111
        支付密码 111111
        账户余额 99999.00
        充值
         * 
 * 
 * </pre>
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
