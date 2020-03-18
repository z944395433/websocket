package com.example.websocket.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Description TODO
 * @Author YIYS
 * @Date 2020/3/1813:29
 **/
@ControllerAdvice
public class ExceptionHandleController {

    protected static final Logger logger = LoggerFactory.getLogger(ExceptionHandleController.class);
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ZlRes<?> handleException(HttpServletRequest request, Exception e) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);
        logger.error(e.getMessage());
        System.out.println("程序发生异常，异常原因：" + e.toString());
        return ZlRes.error("500",e.getMessage(),e.getCause());
    }
}
