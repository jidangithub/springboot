package org.logink.maque;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.core.annotation.Order;

import java.io.IOException;


/**
 * Created by jidanyin.
 */
@Order(1)
//重点
@WebFilter(filterName = "emoFilter", urlPatterns = "/*")
public class DemoFilter extends HttpServlet  implements Filter {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("==>DemoFilter启动");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 将请求转换成HttpServletRequest 请求 
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String path = req.getContextPath();
        String basePath = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+path;
        HttpSession session = req.getSession(true);
        String username = (String) session.getAttribute("username");
        if (username == null || "".equals(username)) {
        	 filterChain.doFilter(req, resp);
//            resp.setHeader("Cache-Control", "no-store");
//            resp.setDateHeader("Expires", 0);
//            resp.setHeader("Prama", "no-cache");
//            //此处设置了访问静态资源类
//            resp.sendRedirect(basePath+"/index.html");
        } else {
            // Filter 只是链式处理，请求依然转发到目的地址。 
            filterChain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {

    }
}
