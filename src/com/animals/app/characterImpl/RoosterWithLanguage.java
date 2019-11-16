package com.animals.app.characterImpl;

import java.util.Locale;

import com.animals.app.util.MessageResource;

public class RoosterWithLanguage extends Chicken {
	
	private Locale locale = null;
	public RoosterWithLanguage(Locale locale) {
		super();
		this.locale = locale;
	}
	@Override
	public void singing() {
		System.err.println(MessageResource.getMessage(locale));
	}

	@Override
	public void chickenType() {
		System.err.println("This is Rooster chicken");	
		}

}
