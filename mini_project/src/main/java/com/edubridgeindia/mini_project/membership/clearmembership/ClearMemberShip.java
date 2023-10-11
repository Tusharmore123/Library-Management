package com.edubridgeindia.mini_project.membership.clearmembership;

import java.util.HashMap;
import java.util.List;

import com.edubridgeindia.mini_project.interfaces.ClearMember;

public class ClearMemberShip implements ClearMember {

	@Override
	public HashMap clearMember(HashMap currentMembers, int studentId) {
		// TODO Auto-generated method stub
		if(currentMembers.get(studentId)!=null) {
			System.out.println("member removed sucessfully");
			currentMembers.remove(studentId);
			
		}
		else {
			System.out.println("invalid  Id");
		}
		
		return currentMembers;
	}

	

}
