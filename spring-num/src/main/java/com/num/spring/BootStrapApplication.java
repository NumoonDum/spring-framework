package com.num.spring;

import com.num.spring.config.AppConfig;
import com.num.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author NumoonDum
 * @date 2020/8/3
 */
public class BootStrapApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService)ac.getBean("userService");
		userService.print("Test");
	}
}