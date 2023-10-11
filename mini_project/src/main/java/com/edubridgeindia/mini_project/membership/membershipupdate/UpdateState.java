package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateState {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		String lastName;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			String state;
			System.out.println("please enter your state:-");
			state=in.next();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			if(!validate.isvalid(state)) {
				in.close();
			}
			List member=(List)currentMembers.get(studentId);
			member.set(6, state);
			
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentMembers;
		
	}

}
