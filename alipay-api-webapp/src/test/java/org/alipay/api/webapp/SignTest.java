/**
 *   Copyright  :  www.aposoft.cn
 */
package org.alipay.api.webapp;

import org.junit.Test;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;

import cn.aposoft.alipay.api.config.impl.AlipayConfigFactory;
import cn.aposoft.constant.Lexical;

/**
 * @author LiuJian
 * @date 2016年10月21日
 * 
 */
public class SignTest {

    @Test
    public void testSign() throws AlipayApiException {
        String signStr = "a=1";
        String signature = AlipaySignature.rsaSign(signStr, AlipayConfigFactory.getConfig().getPrivateKey(), Lexical.UTF8);
        boolean checked = AlipaySignature.rsaCheck(signStr, signature, AlipayConfigFactory.getConfig().getPublicKey(), Lexical.UTF8, "RSA");

        System.out.println(checked);

    }

}
