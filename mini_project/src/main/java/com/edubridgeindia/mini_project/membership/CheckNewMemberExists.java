package com.edubridgeindia.mini_project.membership;

import java.util.HashMap;
import java.util.List;

public class CheckNewMemberExists {
	public boolean checkExists(HashMap currentMembers,int studentId ) {

		if(currentMembers.get(studentId)!=null) {
			return true;
		}
			
		
		
		return false;
	}
	
}
