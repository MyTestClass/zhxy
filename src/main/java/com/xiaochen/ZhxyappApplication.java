package com.xiaochen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@MapperScan("com.xiaochen.dao")//指定dao的位置，会为它们创建代理类的
@EnableWebMvc
@ComponentScan(basePackages= {"com.xiaochen.dao.idleobject.mapper"})
public class ZhxyappApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZhxyappApplication.class, args);
	}
}
//@Data
//@JsonInclude(Include.NON_NULL)
//@AllArgsConstructor
//class User{
//	private String name = null;
//	private int age = 12;
//	private Date date ;
//}