package com.num.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author NumoonDum
 * @date 2020/8/8
 */
@Component
public class LifeCycleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition fifeCycleBeanBeanDefinition = beanFactory.getBeanDefinition("lifeCycle");
		fifeCycleBeanBeanDefinition.setInitMethodName("initMethod");
		fifeCycleBeanBeanDefinition.setDestroyMethodName("destroyMethod");
	}
}