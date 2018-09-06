package com.agilean.dubbo.service;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		
		return "Hello " + name;
	}

}
