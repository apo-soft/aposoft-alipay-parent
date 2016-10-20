/**
 *   Copyright  :  www.aposoft.cn
 */
package org.alipay.api.webapp;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayUserUserinfoShareRequest;

import cn.aposoft.alipay.api.config.impl.AlipayConfigFactory;
import cn.aposoft.constant.Lexical;

/**
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class AlipayClientTest {

    /**
     * @param args
     * @throws AlipayApiException 
     */
    public static void main(String[] args) throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", AlipayConfigFactory.getConfig().getAppId(),
                AlipayConfigFactory.getConfig().getPrivateKey(), Lexical.JSON, Lexical.UTF8, AlipayConfigFactory.getConfig().getPublicKey());
        AlipayUserUserinfoShareRequest request = new AlipayUserUserinfoShareRequest();
        alipayClient.execute(request, "2dab9e54d6e540f584417faea3e6UA78");

    }

}
