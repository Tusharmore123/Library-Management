package com.edubridgeindia.mini_project.membership.viewmemberships;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ViewMembersAsAdmin {
	public void ViewMembAdmin(HashMap currentMembers) {
		Set<Object> eachMember=currentMembers.keySet();
		 
		FormatMembersInfo displayInstance=new FormatMembersInfo();
		int flag=0;
		for(Object displayMember:eachMember) {
			
			List members=(List) currentMembers.get(displayMember);
			if(flag==0) {
			String firstName=displayInstance.formatStringInfo(members.get(0).toString());
			String LastName=displayInstance.formatStringInfo(members.get(4).toString());
			String yourId=displayInstance.formatStringInfo(members.get(1).toString());
			String number=displayInstance.formatStringInfo(members.get(2).toString());
			String email=displayInstance.formatStringInfo(members.get(3).toString());
			String city=displayInstance.formatStringInfo(members.get(5).toString());
			String state=displayInstance.formatStringInfo(members.get(6).toString());
			String zipCode=displayInstance.formatStringInfo(members.get(7).toString());
			
			System.out.println("===================================================================Membership Details===========================================================================================================");
			List membersInfo=(List) currentMembers.get(displayMember);
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
			flag=1;
			}
			else {
				String firstName=displayInstance.formatStringInfo(members.get(0).toString());
				String LastName=displayInstance.formatStringInfo(members.get(4).toString());
				String yourId=displayInstance.formatStringInfo(members.get(1).toString());
				String number=displayInstance.formatStringInfo(members.get(2).toString());
				String email=displayInstance.formatStringInfo(members.get(3).toString());
				String city=displayInstance.formatStringInfo(members.get(5).toString());
				String state=displayInstance.formatStringInfo(members.get(6).toString());
				String zipCode=displayInstance.formatStringInfo(members.get(7).toString());
				List membersInfo=(List) currentMembers.get(displayMember);
							
				System.out.print("||"+firstName+"||");
				System.out.print("||"+LastName+"||");
				System.out.print("||"+yourId+"||");
				System.out.print("||"+number+"||");
				System.out.print("||"+email+"||");
				System.out.print("||"+city+"||");
				System.out.print("||"+state+"||");
				System.out.print("||"+zipCode+"||");
				System.out.println();
				System.out.println("================================================================================================================================================================================================");
				
			}
		}
			
		
	}
}
