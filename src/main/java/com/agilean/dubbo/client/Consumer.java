package com.agilean.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agilean.dubbo.service.DemoService;



public class Consumer {

	public static void main(String[] args) {
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] 
		    		{"dubbo-consumer.xml"});
	        context.start();
	        // Obtaining a remote service proxy
	        DemoService demoService = (DemoService)context.getBean("demoService");
	        // Executing remote methods
	        String hello = demoService.sayHello("world");
	        // Display the call result
	        System.out.println(hello);

	}

}
