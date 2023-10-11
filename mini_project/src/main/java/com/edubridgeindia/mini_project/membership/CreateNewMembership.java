package com.edubridgeindia.mini_project.membership;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CreateNewMembers{
	public List createNewMembers(String studentName,int studentId,long studentNumber,String studentEmail,String studentLastName,String city,String state,int zipCode);
}
public class CreateNewMembership implements CreateNewMembers {

	@Override
	public List createNewMembers(String studentFirstName, int studentId, long studentNumber,String studentEmail,String studentLastName,String city,String state,int zipCode) {
		// TODO Auto-generated method stub
		StudentAddress address=new StudentAddress(city, state, zipCode);
		AddNewMembership addNewMemberInstance=new AddNewMembership();
		
		MembershipDetails newMembersInstance=new MembershipDetails(studentFirstName, studentId,studentNumber,studentEmail,studentLastName, address);
		ArrayList members=new ArrayList();
		members.add(newMembersInstance.getStudentFirstName());
		members.add(newMembersInstance.getStudentId());
		members.add(newMembersInstance.getStudentNumber());
		members.add(newMembersInstance.getEmail());
		members.add(newMembersInstance.getStudentLastName());
		members.add(newMembersInstance.getAddress().getCity());
		members.add(newMembersInstance.getAddress().getState());
		members.add(newMembersInstance.getAddress().getZipCode());
		
		//		String [] newMembersInfo =newMembersInstance.split(" ");
//		List members=Arrays.asList(newMembersInfo);
		return members;
		
	}
	
	
	
}
