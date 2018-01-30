package com.proxy;

public class Main {

	public static void main(String[] args) {
	
		//The client doesnt know if is the real object
		// or the proxy which is the one who receive the 
		//object
		// The main problem with proxy is how to include it
		// between the client and the server.
		// is good to add security, setup, logging, etc
		BusinessObject obj= BusinessObject.create();
		obj.sayHi();
	}

}
