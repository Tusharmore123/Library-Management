package com.edubridgeindia.mini_project.membership.viewmemberships;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.edubridgeindia.mini_project.membership.ExistingMemberships;

public class ViewMembersAsStudent extends FormatMembersInfo  {
	public void viewMembersStudent(HashMap currentMembers,int studentId) {
		FormatMembersInfo displayInstance=new FormatMembersInfo();
		
		if(currentMembers.get(studentId)!=null) {
		
			List members=(List) currentMembers.get(studentId);
			
			String firstName=displayInstance.formatStringInfo(members.get(0).toString());
			String LastName=displayInstance.formatStringInfo(members.get(4).toString());
			String yourId=displayInstance.formatStringInfo(members.get(1).toString());
			String number=displayInstance.formatStringInfo(members.get(2).toString());
			String email=displayInstance.formatStringInfo(members.get(3).toString());
			String city=displayInstance.formatStringInfo(members.get(5).toString());
			String state=displayInstance.formatStringInfo(members.get(6).toString());
			String zipCode=displayInstance.formatStringInfo(members.get(7).toString());
			
			System.out.println("==================================================================Membership Details===========================================================================================================");
			List membersInfo=(List) currentMembers.get(studentId);
			System.out.print("||"+"    FirstName:-     "+"||");
			System.out.print("||"+"   LastName:-       "+"||");
			System.out.print("||"+"   Your Id:-        "+"||");
			System.out.print("||"+"  Mobile Number:-   "+"||");
			System.out.print("||"+"   Your Email:-     "+"||");
			System.out.print("||"+"    City:-          "+"||");
			System.out.print("||"+"    State:-         "+"||");
			System.out.print("||"+"   Zip Code:-       "+"||");
			System.out.println();
			System.out.println("================================================================================================================================================================================================");
			
			System.out.print("||"+firstName+"||");
			System.out.print("||"+LastName+"||");
			System.out.print("||"+yourId+"||");
			System.out.print("||"+number+"||");
			System.out.print("||"+email+"||");
			System.out.print("||"+city+"||");
			System.out.print("||"+state+"||");
			System.out.print("||"+zipCode+"||");
			System.out.println();
			System.out.println("=================================================================================================================================================================================================");
			
		}
			
		else {
			System.out.println("Please enter the valid Student Id");
		}
		
	}
	

}
