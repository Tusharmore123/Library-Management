package com.edubridgeindia.mini_project.interfaces;

import java.util.HashMap;
import java.util.List;

public	interface addNewMemberInterface{
		public HashMap getNewMembershipsInfo(HashMap currentMembers);
		public HashMap addMembership(String studentName, int studentId, long studentNumber,String studentEmail,String studentLastName,String city,String state,int zipCode,HashMap currentMembers);
	}


