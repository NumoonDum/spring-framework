package com.num.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author NumoonDum
 * @date 2020/8/8
 */
@Component
public class LifeCycle implements ApplicationContextAware, BeanFactoryAware, InitializingBean,
		SmartInitializingSingleton, DisposableBean {

	@Autowired
	private AutowiredBean autowiredBean;

	public LifeCycle() {
		System.out.println("Constructor From LifeCycle");
	}

	public void println(String name) {
		System.out.println(String.format("Print %s", name));
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("--------- setBeanFactory ---------");
	}


	@PostConstruct
	public void postConstruct(){
		System.out.println("--------- postConstruct ---------");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("--------- afterPropertiesSet ---------");
	}


	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("--------- afterSingletonsInstantiated ---------");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("--------- setApplicationContext ---------");
	}

	public void initMethod(){
		System.out.println("--------- initMethod ---------");
	}

	public void destroyMethod(){
		System.out.println("--------- destroyMethod ---------");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("--------- destroy ---------");
	}
}