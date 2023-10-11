package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateFirstName {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		String newFirstName;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter First Name:-");
			newFirstName=in.next();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			if(!validate.isvalid(newFirstName)) {
				in.close();
			}
			else {
			List member=(List)currentMembers.get(studentId);
			member.set(0, newFirstName);
			}
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentMembers;
		
	}

}
