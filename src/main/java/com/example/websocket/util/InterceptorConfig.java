package com.example.websocket.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Author YIYS
 * @Date 2020/1/2010:34
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

       registry.addInterceptor(new AuthenticationInterceptor())
               .addPathPatterns("/**")
               .excludePathPatterns("/sys/login")
               .excludePathPatterns("/static/**")
       ;
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
}
