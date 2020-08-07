package com.num.spring.service;

import org.springframework.stereotype.Component;

/**
 * @author NumoonDum
 * @date 2020/8/3
 */
@Component
public class UserService {
	public void print(String name){
		System.out.print(String.format("Print %s", name));
	}
}