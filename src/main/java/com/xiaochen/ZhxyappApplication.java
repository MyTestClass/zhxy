package com.xiaochen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


//(exclude=DataSourceAutoConfiguration.class)
@SpringBootApplication
//@MapperScan("com.xiaochen.dao")//指定dao的位置，会为它们创建代理类的
@EnableWebMvc
@ComponentScan(basePackages="com.xiaochen")
public class ZhxyappApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZhxyappApplication.class, args);
		//
//		List<User> list = new ArrayList<>();
//		for(int i=0;i<10;i++) {
//			list.add(new User(""+i,i,new Date()));
//		}
//		try {
//			System.out.println(JsonUtils.toJsonString(list));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
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