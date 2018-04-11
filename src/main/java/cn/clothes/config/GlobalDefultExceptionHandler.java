package cn.clothes.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * 
 * 
 * 全局错误类
 * @author Administrator
 *
 */
@ControllerAdvice  
public class GlobalDefultExceptionHandler {  
      
    //声明要捕获的异常  
    @ExceptionHandler(Exception.class)  
    public String defultExcepitonHandler(HttpServletRequest request,Exception e) {  
        return "error/500";  
    }  
} 
