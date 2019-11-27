package com.wyw.msa.config;

import com.wyw.msa.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器  实现addInterceptors()
 *
 * @author wangyw
 * @date 2019/11/13
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器 配置路径
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
