package com.edubridgeindia.mini_project.membership.membershipupdate;

import java.util.HashMap;
import java.util.Scanner;

public class UpdateMemberShip {
	public HashMap updateMembersInfo(HashMap currentMember,int studentId) {
		int option;
		Scanner in=new Scanner(System.in);
		if(currentMember.get(studentId)==null) {
			System.out.println("enter the valid Id.");
			return currentMember;
		}
		System.out.println("Please Select the options you would like to update");
		System.out.println("1.update First Name");
		System.out.println("2.update Last  Name");
		System.out.println("3.update Student Id");
		System.out.println("4.update phone number");
		System.out.println("5.update  email address");
		System.out.println("6.update your city");
		System.out.println("7.update your state");
		System.out.println("8.update your zip code");
		System.out.println("9.update all details");
		option=in.nextInt();
		switch (option) {
		case 1: {
			UpdateFirstName firstname=new UpdateFirstName();
			currentMember=firstname.update(currentMember,studentId);
			
			break;
		}
		case 2: {
			UpdateLastName lastName=new UpdateLastName();
			currentMember=lastName.update(currentMember,studentId);
			
			break;
		}
		case 3: {
			UpdateMemberId newId=new UpdateMemberId();
			currentMember=newId.update(currentMember, studentId);
			
			break;
		}
		case 4: {
			UpdatePhoneNumber number=new UpdatePhoneNumber();
			currentMember=number.update(currentMember, studentId);
			
			break;
		}
		case 5: {
			UpdateEmail email=new UpdateEmail();
			currentMember=email.update(currentMember, studentId);
			System.out.println(currentMember);
			break;
		}
		case 6: {
			UpdateCity city=new UpdateCity();
			currentMember=city.update(currentMember,studentId);
			
			break;
		}
		case 7: {
			UpdateState state=new UpdateState();
			currentMember=state.update(currentMember, studentId);
			
			break;
		}
		case 8: {
			UpdateZipCode zipCode=new UpdateZipCode();
			currentMember=zipCode.update(currentMember, studentId);
			
			break;
		}
		case 9:{
			UpdateAllMembersInfo updateAll=new UpdateAllMembersInfo();
			currentMember=updateAll.update(currentMember, studentId);
			
			break;
		}
		default:
			System.out.println("please enter valid options only");;
		}
		return currentMember;
		
	}
}
