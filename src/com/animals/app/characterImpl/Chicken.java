package com.animals.app.characterImpl;

import com.animals.app.Bird;

public class Chicken extends Bird{

	@Override
	public void singing() {
		System.err.println("Cluck, cluck");
	}
	
	public void chickenType(){
		System.err.println("Its normal chicken");
	}

	

}
