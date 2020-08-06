package yonmin.blog.component;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 登陆检查
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {

    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null){
            request.setAttribute("msg","未登录，没有权限");
//            response.sendRedirect("/admin");
            request.getRequestDispatcher("/admin").forward(request,response);
            return false;
        }
        return true;
    }
}