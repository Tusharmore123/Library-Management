package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UpdateMemberId {
	
	public HashMap update(HashMap currentMembers,int studentId) {
		int newId;
		if(currentMembers.get(studentId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter new ID:-");
			newId=in.nextInt();
			List member=(List)currentMembers.get(studentId);
			member.set(1, newId);
			currentMembers.put(newId, member);
			currentMembers.remove(studentId);
			
		}
		else {
			System.out.println("please enter the valid Id ");
		}
		return currentMembers;
		
	}

}
