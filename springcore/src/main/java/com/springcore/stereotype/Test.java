package com.springcore.stereotype;

import java.rmi.StubNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}

}
