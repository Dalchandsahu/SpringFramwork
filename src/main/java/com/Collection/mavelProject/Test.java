package com.Collection.mavelProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("Person.cfg.xml");
		Person p1 = con.getBean("person1", Person.class);
		System.out.println(p1);

	}
}
