package cn.clothes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.clothes.interceptor.LoginInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class ConfigInteceptor extends WebMvcConfigurerAdapter{
	 @Autowired
	private LoginInterceptor loginInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(loginInterceptor).excludePathPatterns("/login.html").addPathPatterns("/content/**");
	}
}

