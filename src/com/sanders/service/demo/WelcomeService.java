package com.sanders.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {
	
	public List<String> getWelcomeMessage(String name){
		List<String> myWelcomeMessage = new ArrayList<>();
		
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to Spring.");
		
		return myWelcomeMessage;
 	}
}
