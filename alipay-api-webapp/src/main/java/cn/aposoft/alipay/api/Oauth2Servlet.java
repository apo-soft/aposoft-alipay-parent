package cn.aposoft.alipay.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.aposoft.util.HttpUtils;

/**
 * Servlet implementation class Oauth2Servlet
 */
@WebServlet("/oauth2/access_token/")
public class Oauth2Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oauth2Servlet() {
        super();
    }

    /**
     * 
     * @see https://www.aposoft.cn/alipay/oauth2/access_token/?app_id=2016072800108741&source=alipay_wallet&scope=auth_base&state=1480202841737787&auth_code=9ee00896ab0b49c7a4a7bb985874VD78
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpUtils.printHeaders(request);
        HttpUtils.printParams(request);

        String scope = request.getParameter("scope");
        String state = request.getParameter("state");
        String auth_code = request.getParameter("auth_code");
        String source = request.getParameter("source");
        String app_id = request.getParameter("app_id");
        
        
        
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
