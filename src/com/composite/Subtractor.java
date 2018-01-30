package com.composite;

public class Subtractor extends BinaryExpression {


		
	public Subtractor(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.left.getValue()-this.right.getValue();
	}


}
