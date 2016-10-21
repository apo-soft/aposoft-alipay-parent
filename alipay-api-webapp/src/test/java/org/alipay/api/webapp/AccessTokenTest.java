/**
 *   Copyright  :  www.aposoft.cn
 */
package org.alipay.api.webapp;

import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;

import cn.aposoft.alipay.api.auth.impl.BasicOAuth2Service;

/**
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class AccessTokenTest {
    static String code = "50b24c95c7594986af9143683a47WX78";

    public static void main(String[] args) throws AlipayApiException {
        BasicOAuth2Service service = new BasicOAuth2Service();
        AlipaySystemOauthTokenResponse token = service.getAccessToken(code, "");
        System.out.println(token);
    }
}
