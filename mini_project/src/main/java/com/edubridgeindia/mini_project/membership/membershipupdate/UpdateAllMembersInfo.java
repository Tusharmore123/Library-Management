package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateAllMembersInfo {
	public HashMap update(HashMap currentMembers,int studentId) {
		Scanner in=new Scanner(System.in);
		
		ValidatingValuseEntered validate=new ValidatingValuseEntered();
		String studentFirstName;
		String studentLastName;
		int newId;
		long studentNumber;
		String studentEmail;
		String city;
		String state;
		int zipCode;
		
		
		System.out.println("Please enter your First name:-");
		 studentFirstName=in.next();
		if(!validate.isvalid(studentFirstName)){
			in.close();
			
		}
		System.out.println("Please enter your Last name:-");
		 studentLastName=in.next();
		if(!validate.isvalid(studentLastName)){
			in.close();
			
		}
		System.out.println("Please enter your new Id");
		newId=in.nextInt();
		
		
		System.out.println("Please enter your mobile number:-");
		 studentNumber=in.nextLong();
		
		System.out.println("Please enter your email:-");
		 studentEmail=in.next();
		if(!validate.isvalid(studentEmail)){
			in.close();
			
		}
		System.out.println("please enter your city:-");
		city=in.next();
		if(!validate.isvalid(city)){
			in.close();
			
		}
		System.out.println("please enter your state");
		state=in.next();
		System.out.println("Please enter your zipCode");
		zipCode=in.nextInt();
		List member=(List)currentMembers.get(studentId);
		member.set(0, studentFirstName);
		member.set(1, newId);
		member.set(2, studentNumber);
		member.set(3, studentEmail);
		member.set(4, studentLastName);
		member.set(5, city);
		member.set(6, state);
		member.set(7, zipCode);
		currentMembers.put(newId, member);
		currentMembers.remove(studentId);
		return currentMembers;
		
	}
}
