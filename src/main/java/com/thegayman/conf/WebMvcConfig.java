package com.thegayman.conf;
 

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.thegayman.interception.RestfulInterceptor;
 

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * 配置拦截器
	 * 
	 * @author lance
	 * @param registry
	 */
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new RestfulInterceptor())
				.addPathPatterns("/user/**").excludePathPatterns("/Restful/**");
	}

	
}
