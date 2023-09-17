package com.dcsProject.mavelProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
       Student stu = (Student) context.getBean("student1");
       System.out.println(stu); 
       
       Student stu2 = (Student) context.getBean("stud2");
       System.out.println(stu2); 
       
       Student stu3 = (Student) context.getBean("stud3");
       System.out.println(stu3); 
    }
}
