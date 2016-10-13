package com.ws.server.impl;

import javax.jws.WebService;

import com.ws.server.HelloI;

@WebService
public class HelloImpl implements HelloI {

	public void sayHello(String name) {
		System.out.println("hello" + name);

	}

}
