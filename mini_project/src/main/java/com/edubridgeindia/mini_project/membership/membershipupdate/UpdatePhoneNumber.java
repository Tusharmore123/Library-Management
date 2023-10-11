package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UpdatePhoneNumber {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		Long newNumber;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter phone number:-");
			newNumber=in.nextLong();
			List member=(List)currentMembers.get(studentId);
			member.set(2,newNumber);
			
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentMembers;
		
	}

}
