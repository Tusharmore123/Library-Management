package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateLastName {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		String newLastName;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter your last name:-");
			newLastName=in.next();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			if(!validate.isvalid(newLastName)) {
				in.close();
			}
			else {
				List member=(List)currentMembers.get(studentId);
				member.set(4, newLastName);
				
			}
			
		}
		else {
			System.out.println("please enter the valid Id ");
		}
		return currentMembers;
		
	}

}
