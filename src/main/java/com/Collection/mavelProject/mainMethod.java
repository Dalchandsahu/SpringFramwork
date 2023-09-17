package com.Collection.mavelProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dcsProject.mavelProject.Student;

public class mainMethod {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
	     Employee emp = (Employee) context.getBean("Emp1");
	     System.out.println(emp); 
	}
}
