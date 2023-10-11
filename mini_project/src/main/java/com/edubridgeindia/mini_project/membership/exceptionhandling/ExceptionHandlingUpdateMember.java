package com.edubridgeindia.mini_project.membership.exceptionhandling;

import java.util.HashMap;
import java.util.InputMismatchException;

import com.edubridgeindia.mini_project.membership.membershipupdate.UpdateMemberShip;


class InputInValid extends RuntimeException{
	InputInValid(String m){
		super(m);
		System.out.println("please enter the valid values only");
	}
}
public class ExceptionHandlingUpdateMember {
	public HashMap updateMembers(HashMap currentMembers,int studentId) {
	try {
		UpdateMemberShip updateInstance=new UpdateMemberShip();
		currentMembers=updateInstance.updateMembersInfo(currentMembers, studentId);
	}
	catch(InputMismatchException e){
		updateMembers(currentMembers, studentId);
	}
	return currentMembers;
	}
}
