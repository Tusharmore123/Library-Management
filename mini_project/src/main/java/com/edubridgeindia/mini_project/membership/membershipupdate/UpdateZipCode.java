package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UpdateZipCode {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		int newZipCode;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter your new Zip Code:-");
			newZipCode=in.nextInt();
			List member=(List)currentMembers.get(studentId);
			member.set(7, newZipCode);
			
		}
		return currentMembers;
		
	}

}
