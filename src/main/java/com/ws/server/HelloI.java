package com.ws.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloI {
	
	public void sayHello(@WebParam(name = "name")String name);

}
