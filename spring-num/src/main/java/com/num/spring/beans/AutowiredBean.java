package com.num.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author NumoonDum
 * @date 2020/8/8
 */
@Component
public class AutowiredBean {

	@Autowired
	private LifeCycle lifeCycle;

	public AutowiredBean() {
		System.out.println("Constructor From AutowiredBean");
	}
}