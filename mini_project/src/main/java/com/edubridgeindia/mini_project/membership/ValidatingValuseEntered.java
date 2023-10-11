package com.edubridgeindia.mini_project.membership;

import java.util.InputMismatchException;

public class ValidatingValuseEntered {
	public boolean isvalid(String input) {
		if(input.matches("[0-9]") || input.trim().length()<1) {
			System.out.println("invalid value is entered");
			throw new InputMismatchException( "please enter valid values only" );
			
		}
		return true;
		
	}
	
		
	

}
