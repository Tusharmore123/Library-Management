package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateEmail {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		String newEmail;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter your new Email:-");
			newEmail=in.next();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			if(!validate.isvalid(newEmail)) {
				in.close();
			}
			else {
			List member=(List)currentMembers.get(studentId);
			member.set(3, newEmail);
			}
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentMembers;
		
	}

}
