/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.alipay.api;

/**
 * AlipayOauth2 scope
 * 
 * @see https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.7I59AG&treeId=220&articleId=105337&docType=1
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public enum AlipayOauth2Scope {
    /**
     * 可以读取用户信息，需要用户手动授权
     */
    auth_userinfo("auth_userinfo"),
    /**
     * 静默授权，仅读取用户id
     */
    auth_base("auth_base");
    private final String scope;

    private AlipayOauth2Scope(String scope) {
        this.scope = scope;
    }

    /**
     * 
     * @return 授权范围
     */
    public String getScope() {
        return this.scope;
    }
}
