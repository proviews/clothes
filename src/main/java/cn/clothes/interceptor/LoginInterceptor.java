package cn.clothes.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		 Object userTable = request.getSession().getAttribute("userTable");
		 System.out.println(userTable);
		    if (userTable == null) {
		      response.sendRedirect("/login.html");
		      return false;
		    }
		    return true;
	}
}
