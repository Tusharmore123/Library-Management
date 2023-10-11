package com.edubridgeindia.mini_project.books.IssueBooks;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.edubridgeindia.mini_project.books.ExistingBooks;
import com.edubridgeindia.mini_project.membership.ExistingMemberships;
import com.edubridgeindia.mini_project.membership.viewmemberships.FormatMembersInfo;

public class ViewIssuedBooks {
	public void view(HashMap issuedBooks) {
		
			Set<Object> eachMember=issuedBooks.keySet();
			 
			FormatMembersInfo displayInstance=new FormatMembersInfo();
			int flag=0;
			
			for(Object displayMember:eachMember) {
				
				List members=(List) issuedBooks.get(displayMember);
				if(flag==0) {
				String firstName=displayInstance.formatStringInfo(members.get(0).toString());
				String LastName=displayInstance.formatStringInfo(members.get(4).toString());
				String yourId=displayInstance.formatStringInfo(members.get(1).toString());
				String number=displayInstance.formatStringInfo(members.get(2).toString());
				String email=displayInstance.formatStringInfo(members.get(3).toString());
				String city=displayInstance.formatStringInfo(members.get(5).toString());
				String state=displayInstance.formatStringInfo(members.get(6).toString());
				String zipCode=displayInstance.formatStringInfo(members.get(7).toString());
				String bookName=displayInstance.formatStringInfo(members.get(8).toString());
				String bookId=displayInstance.formatStringInfo(members.get(9).toString());
				String bookPrice=displayInstance.formatStringInfo(members.get(10).toString());
				String bookAuthor=displayInstance.formatStringInfo(members.get(11).toString());
				System.out.println("============================================================================================================Membership Details=======================================================================================================================================================================");
				List membersInfo=(List) issuedBooks.get(displayMember);
				System.out.print("||"+"    FirstName:-     "+"||");
				System.out.print("||"+"   LastName:-       "+"||");
				System.out.print("||"+"   Your Id:-        "+"||");
				System.out.print("||"+"  Mobile Number:-   "+"||");
				System.out.print("||"+"   Your Email:-     "+"||");
				System.out.print("||"+"    City:-          "+"||");
				System.out.print("||"+"    State:-         "+"||");
				System.out.print("||"+"   Zip Code:-       "+"||");
				System.out.print("||"+"   Book Name:-      "+"||");
				System.out.print("||"+"     Book Id:-      "+"||");
				System.out.print("||"+"     Book Price:-   "+"||");
				System.out.print("||"+"     Book Author:-  "+"||");
				System.out.println();
				System.out.println("========================================================================================================================================================================================================================================================================================================");
				
				System.out.print("||"+firstName+"||");
				System.out.print("||"+LastName+"||");
				System.out.print("||"+yourId+"||");
				System.out.print("||"+number+"||");
				System.out.print("||"+email+"||");
				System.out.print("||"+city+"||");
				System.out.print("||"+state+"||");
				System.out.print("||"+zipCode+"||");
				System.out.print("||"+bookName+"||");
				System.out.print("||"+bookId+"||");
				System.out.print("||"+bookPrice+"||");
				System.out.print("||"+bookAuthor+"||");
				System.out.println();
				System.out.println("=========================================================================================================================================================================================================================================================================================================");
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
					String bookName=displayInstance.formatStringInfo(members.get(8).toString());
					String bookId=displayInstance.formatStringInfo(members.get(9).toString());
					String bookPrice=displayInstance.formatStringInfo(members.get(10).toString());
					String bookAuthor=displayInstance.formatStringInfo(members.get(11).toString());
					
					List membersInfo=(List) issuedBooks.get(displayMember);
								
					System.out.print("||"+firstName+"||");
					System.out.print("||"+LastName+"||");
					System.out.print("||"+yourId+"||");
					System.out.print("||"+number+"||");
					System.out.print("||"+email+"||");
					System.out.print("||"+city+"||");
					System.out.print("||"+state+"||");
					System.out.print("||"+zipCode+"||");
					System.out.print("||"+bookName+"||");
					System.out.print("||"+bookId+"||");
					System.out.print("||"+bookPrice+"||");
					System.out.print("||"+bookAuthor+"||");
					System.out.println();
					System.out.println("===========================================================================================================================================================================================================================================================================================================");
					
				}
			}
				
			
		}
	
	public static void main(String[] args) {
		ViewIssuedBooks v=new ViewIssuedBooks();
		IssueBooksToMembers i=new IssueBooksToMembers();
		ExistingBooks e=new ExistingBooks();
		ExistingMemberships m=new ExistingMemberships();
		HashMap issued=i.callBooksMembers(m.existingMembers(), e.existingBooks());
		v.view(issued);
	}
}
