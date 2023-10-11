package com.edubridgeindia.mini_project.membership;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExistingMemberships  {
	public HashMap<Integer, List> existingMembers() {
		CreateNewMembership createMemberInstance=new CreateNewMembership();
		
		HashMap <Integer,List> existingMembers=new HashMap();
		existingMembers.put(1,createMemberInstance.createNewMembers("Kapil", 1,123456,"Kapil@gmail.com","sharma","bandra","maharshtra",102));
		existingMembers.put(2,createMemberInstance.createNewMembers("Wills",2,1234567881,"wills@gmail.com","Smith","australia","australia",103));
		existingMembers.put(3,createMemberInstance.createNewMembers("Virat", 3,1234563,"virat@gmail.com","Kohli","Worli","maharshtra",104));
		
		return existingMembers;
	}
	
}
