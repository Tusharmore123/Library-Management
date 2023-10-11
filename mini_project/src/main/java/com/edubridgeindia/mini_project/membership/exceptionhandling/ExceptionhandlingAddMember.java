package com.edubridgeindia.mini_project.membership.exceptionhandling;

import java.util.HashMap;
import java.util.InputMismatchException;

import com.edubridgeindia.mini_project.membership.AddNewMembership;



public class ExceptionhandlingAddMember {
	
	public HashMap newMember(HashMap currentMembers) {
		
		AddNewMembership n = new AddNewMembership();

		try {
			 currentMembers = n.getNewMembershipsInfo( currentMembers);
		} catch (InputMismatchException e) {
			System.out.println("please enter valid values only");
			newMember(currentMembers);
			
		}
		return currentMembers;
	}
}
