//package com.example.websocket.util;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @Description TODO
// * @Author YIYS
// * @Date 2020/3/1216:09
// **/
//@Component
//@Aspect
//public class AopAroudUtils {
//
//    @Pointcut("@annotation(com.example.websocket.util.OperationLog)")
//    public void pointcut()
//    {
//
//    }
//
//    @Around("@annotation(operationLog)")
//    public Object operationLogRecord(ProceedingJoinPoint joinPoint, OperationLog operationLog)
//    {
//        //获取请求
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        //响应
//        ResponseResult<Object> responseResult = null;
//        //判断原方法是否正常执行的标志
//        boolean isNormalProcess = false;
//
//        try
//        {
//            //返回切点处继续执行原方法，并接收原方法的响应
//            responseResult = (ResponseResult<Object>) joinPoint.proceed();
//            //如果顺利执行，那么说明原方法执行正常，就可以进行日志记录。因为，如果原方法的增删改出问题了，那么日志就不需要记录了，不用记录失败的操作。
//            isNormalProcess = true;
//        }
//        catch (Throwable e){
//            e.printStackTrace();
//        }
//
//        return  responseResult;
//    }
//
//
//
//
//
//
//
//
//}
