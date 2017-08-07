package com.thegayman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


//@MapperScan("com.thegayman.mapper")
@SpringBootApplication
@ServletComponentScan
public class ComeonMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComeonMarketApplication.class, args);
//
	}
}
