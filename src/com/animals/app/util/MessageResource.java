package com.animals.app.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageResource {
	
	public static String getMessage(Locale locale){
		
		ResourceBundle bundle = ResourceBundle.getBundle("com.animals.app.nls.data", locale);
		if(bundle == null)
			return null;
		return bundle.getString("animal.sound");
		
		
	}

}
