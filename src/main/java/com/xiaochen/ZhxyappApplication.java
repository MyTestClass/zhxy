package com.xiaochen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


//(exclude=DataSourceAutoConfiguration.class)
@SpringBootApplication
@MapperScan("com.xiaochen.dao")//指定dao的位置，会为它们创建代理类的
@EnableWebMvc
public class ZhxyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhxyappApplication.class, args);
	}
}
