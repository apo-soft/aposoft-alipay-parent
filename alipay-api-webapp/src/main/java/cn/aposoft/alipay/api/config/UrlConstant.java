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

    public static final String ALIPAY_BASE_URL = "https://openauth.alipay.com";
    public static final String ALIPAY_BASE_DEV_URL = "https://openauth.alipaydev.com";
    // 当前使用开发环境
    public static final String CURRENT_ALIPAY_BASE_URL = ALIPAY_BASE_DEV_URL;

    // 生产环境
    // https://openauth.alipay.com/oauth2/publicAppAuthorize.htm
    // 开发环境
    public static final String OAUTH2_URL = CURRENT_ALIPAY_BASE_URL + "/oauth2/publicAppAuthorize.htm?";

    // 阿里网关地址
    public static final String ALIPAY_GATEWAY_URL = CURRENT_ALIPAY_BASE_URL + "/gateway.do";
    // 本地开放的回调函数基地址
    public static final String APOSOFT_ALIPAY_BASE_URL = "https://www.aposoft.cn/alipay";
    // 本地回调
    public static final String OAUTH2_CALLBACK_URL = APOSOFT_ALIPAY_BASE_URL + "/oauth2/access_token/";

}
