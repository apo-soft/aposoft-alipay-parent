package cn.aposoft.alipay.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;

import cn.aposoft.alipay.api.auth.OAuth2Service;
import cn.aposoft.alipay.api.auth.impl.BasicOAuth2Service;
import cn.aposoft.alipay.api.config.UrlConstant;

/**
 * oauth2 授权起始页
 */
@WebServlet("/auth")
public class AuthorizeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private OAuth2Service oauth2Service = new BasicOAuth2Service();

    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorizeServlet() {
        super();
    }

    /**
     * 
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String scope = request.getParameter("scope");
        if (!AlipayOauth2Scope.auth_base.getScope().equals(scope) && !AlipayOauth2Scope.auth_userinfo.getScope().equals(scope)) {
            response.setStatus(HttpStatus.SC_NOT_FOUND);
            return;
        }

        String redirectUrl = oauth2Service.getRedirectUrl(UrlConstant.OAUTH2_CALLBACK_URL, scope);
        // 重定向:alipay oauth2
        response.sendRedirect(redirectUrl);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
