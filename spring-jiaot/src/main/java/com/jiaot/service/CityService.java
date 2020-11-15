package com.jiaot.service;

import org.springframework.stereotype.Component;

@Component("cityService")
public class CityService {

	/**
	 * 测试bean的注入
	 */
	public void info(){
		System.out.println("测试环境搭建成功了");
	}
}
