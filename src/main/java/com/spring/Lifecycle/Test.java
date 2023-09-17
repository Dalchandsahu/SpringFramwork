package com.spring.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("Sprinlife.xml");
		
		samosa s1 = (samosa) context.getBean("s1");
		System.out.println(s1);
		
		System.out.println("+++++++++++++++++++");
		
		Pepasi p1 = (Pepasi) context.getBean("p1");
	    System.out.println(p1);
	
	}
}
