package com.edubridgeindia.mini_project.membership;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.interfaces.addNewMemberInterface;



public class AddNewMembership implements addNewMemberInterface{

	@Override
	public HashMap getNewMembershipsInfo(HashMap currentMembers) {
		// TODO Auto-generated method stub
				ValidatingValuseEntered validate=new ValidatingValuseEntered();
				Scanner in=new Scanner(System.in);
		System.out.println("Please enter your First name:-");
		String studentFirstName=in.next();
		if(!validate.isvalid(studentFirstName)){
			in.close();
			
		}
		System.out.println("Please enter your Last name:-");
		String studentLastName=in.next();
		if(!validate.isvalid(studentLastName)){
			in.close();
			
		}
		System.out.println("Please enter your Id:-");
		int studentId=in.nextInt();
		in.nextLine();
		System.out.println("Please enter your mobile number:-");
		long studentNumber=in.nextLong();
		
		System.out.println("Please enter your email:-");
		String studentEmail=in.next();
		if(!validate.isvalid(studentEmail)){
			in.close();
			
		}
		System.out.println("please enter your city:-");
		String city=in.next();
		if(!validate.isvalid(city)){
			in.close();
			
		}
		System.out.println("please enter your state");
		String state=in.next();
		System.out.println("Please enter your zipCode");
		int zipCode=in.nextInt();
		
		currentMembers=addMembership(studentFirstName, studentId, studentNumber, studentEmail,studentLastName, city, state, zipCode,currentMembers);
		return currentMembers;
	}

	@Override
	public HashMap addMembership(String studentFirstName, int studentId, long studentNumber, String studentEmail,String studentLastName,String city,
			String state, int zipCode,HashMap  currentMembers) {
		// TODO Auto-generated method stub
		CreateNewMembership createMemberInstance=new CreateNewMembership();
		CheckNewMemberExists checkMembInstance=new CheckNewMemberExists();
		List newMemberCreated=createMemberInstance.createNewMembers(studentFirstName, studentId, studentNumber, studentEmail,studentLastName, city, state, zipCode)
				;
		
		
		
		if(checkMembInstance.checkExists(currentMembers, studentId)){
			System.out.println("Member already exists");
		}
		else {
			currentMembers.put(studentId,newMemberCreated);
		
		System.out.println("New Member is Successfully Added");
		
		}
		return currentMembers;
	}

}
