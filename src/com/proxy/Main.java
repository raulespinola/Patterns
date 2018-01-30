package com.proxy;

public class Main {

	public static void main(String[] args) {
	
		BusinessObject obj= new BusinessObjectProxy(new BusinessObjectImplementation());
		obj.sayHi();
	}

}
