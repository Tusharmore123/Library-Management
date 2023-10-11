package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateCity {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		String newCity;
		ValidatingValuseEntered validate=new ValidatingValuseEntered();
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter your city:-");
			newCity=in.next();
			if(!validate.isvalid(newCity)) {
				in.close();
			}
			else {
			List member=(List)currentMembers.get(studentId);
			member.set(5, newCity);
			}
		}
		else {
			System.out.println("please enter the valid id:");
		}
		return currentMembers;
		
	}

}
