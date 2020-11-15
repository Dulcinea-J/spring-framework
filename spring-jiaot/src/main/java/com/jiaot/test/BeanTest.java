package com.jiaot.test;

import com.jiaot.app.AppConfig;
import com.jiaot.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CityService cityService = (CityService) context.getBean("cityService");
		cityService.info();
		System.out.println("success");
	}
}
