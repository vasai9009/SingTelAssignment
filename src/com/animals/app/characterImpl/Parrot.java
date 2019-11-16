package com.animals.app.characterImpl;

import com.animals.app.Bird;

public class Parrot extends Bird{
	private String birdSingingMessage;
	public Parrot(String birdSingingMessage) {
		super();
		this.birdSingingMessage = birdSingingMessage;
	}
	public void singing() {
		System.err.println(this.birdSingingMessage);
	}
	
	
	
}
