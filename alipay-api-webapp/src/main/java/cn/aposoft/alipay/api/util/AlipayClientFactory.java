/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.util;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

import cn.aposoft.alipay.api.config.UrlConstant;
import cn.aposoft.alipay.api.config.impl.AlipayConfigFactory;
import cn.aposoft.constant.Lexical;

/**
 * 
 * AlipayClient Factory hold singleton instance of the AlipayClient
 * 
 * @author LiuJian
 * @date 2016年10月21日
 * 
 */
public class AlipayClientFactory {

    private static AlipayClient client = new DefaultAlipayClient(UrlConstant.ALIPAY_GATEWAY_URL, AlipayConfigFactory.getConfig().getAppId(),
            AlipayConfigFactory.getConfig().getPrivateKey(), Lexical.JSON, Lexical.UTF8, AlipayConfigFactory.getConfig().getAlipayPublicKey());

    public static final AlipayClient getClient() {
        return client;
    }
}
