package com.example.newcoder.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/13 21:16
 *
 * */
@Configuration//配置类，一般是生成第三方bean，这里实现接口
public class WebMvcConfig implements WebMvcConfigurer
{

    //注入拦截器，给它配置
    @Autowired
    private AlphaInterceptor alphaInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(alphaInterceptor).excludePathPatterns("/",
                "/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*" +
                        ".jpeg").addPathPatterns("/register", "/login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/image/**").addResourceLocations(
                "classpath:/images/").addResourceLocations("classpath:/static"
                + "/");


    }
}

