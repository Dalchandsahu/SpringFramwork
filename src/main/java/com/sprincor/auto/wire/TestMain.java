package com.sprincor.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sprincor/auto/wire/Autoconfig.xml");
	Emp emp1 = context.getBean("emp1",Emp.class);
	System.out.println(emp1);
	
	}
}
