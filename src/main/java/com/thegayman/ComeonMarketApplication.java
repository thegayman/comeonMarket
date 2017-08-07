package com.thegayman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.thegayman.interception.RestfulInterceptor;
 


@MapperScan("com.thegayman.mapper")
@SpringBootApplication
@ServletComponentScan
public class ComeonMarketApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(ComeonMarketApplication.class, args);
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
//		 registry.addInterceptor(new RestfulInterceptor())
			
		super.addInterceptors( registry);
		registry.addInterceptor(new RestfulInterceptor()).excludePathPatterns("/Restful/**");
	     
	}
	 
	/**
	 * 设置允许跨域访问
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true)
				.allowedMethods("GET", "POST").maxAge(3600);
	}  
}
