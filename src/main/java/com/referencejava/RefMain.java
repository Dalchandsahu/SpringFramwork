package com.referencejava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("ReferenceCfg.xml");
	    A temp = (A) context.getBean("aref");
	System.out.println(temp.getX() );
	
	System.out.println(temp.getOb().getY());
	}
}
