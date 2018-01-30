package com.proxy;

public class BusinessObjectProxy implements BusinessObject {

	private BusinessObject target;
	
	
	
	public BusinessObjectProxy(BusinessObject target) {
		this.target = target;
	}



	@Override
	public void sayHi() {
		System.out.println("About to call real..");
		this.target.sayHi();
		System.out.println("Complete call real..");
	}

}
