package com.sample.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassA classA = ctx.getBean(ClassA.class);
		classA.proc();
		ctx.close();
	}

}