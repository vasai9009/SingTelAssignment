package com.animals.app;

public class Bird extends Animals implements Sing{
	
	void fly(){
		System.err.println("I am flying");
	}

	@Override
	public void singing() {
		System.err.println("I am siging");
		
	}

	@Override
	void walk() {
		super.walk();
	}

}
