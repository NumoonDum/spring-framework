package com.num.spring.test;

import com.num.spring.beans.LifeCycle;
import com.num.spring.config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author NumoonDum
 * @date 2020/8/8
 */
public class DemoTest {

	@Test
	public void lifeCycle() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		LifeCycle lifeCycle = (LifeCycle)ac.getBean("lifeCycle");
		lifeCycle.println("Test");
		ac.close();
	}
}