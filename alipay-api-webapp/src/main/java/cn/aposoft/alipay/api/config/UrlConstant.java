/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api.config;

/**
 * Url地址
 * 
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class UrlConstant {
    private UrlConstant() {
    }

    public static final String APOSOFT_ALIPAY_BASE_URL = "https://www.aposoft.cn/alipay";
    //                                                                     https://openauth.alipay.com/oauth2/publicAppAuthorize.htm
    public static final String OAUTH2_URL = "https://openauth.alipaydev.com/oauth2/publicAppAuthorize.htm?";

    public static final String OAUTH2_CALLBACK_URL = APOSOFT_ALIPAY_BASE_URL + "/oauth2/access_token/";

}
