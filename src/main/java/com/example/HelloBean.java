package com.example;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

	public String sayHello(){
		return "Say Hello, Dude";
	}
}
