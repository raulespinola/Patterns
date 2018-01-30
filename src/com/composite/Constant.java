package com.composite;

public class Constant implements Expression {

	private double testValue;
	
	public Constant(double testValue) {
		this.testValue= testValue;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.testValue;
	}

}
