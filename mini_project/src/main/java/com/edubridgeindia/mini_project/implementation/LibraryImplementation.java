package com.edubridgeindia.mini_project.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.books.ExistingBooks;
import com.edubridgeindia.mini_project.books.IssueBooks.IssueBooksToMembers;
import com.edubridgeindia.mini_project.books.IssueBooks.ViewIssuedBooks;
import com.edubridgeindia.mini_project.books.displaybooks.ViewBooks;
import com.edubridgeindia.mini_project.books.exceptionhandling.ExceptionHandlingUpdateBooks;
import com.edubridgeindia.mini_project.books.exceptionhandling.ExceptionhandlingAddBooks;
import com.edubridgeindia.mini_project.books.removebooks.ClearBooks;
import com.edubridgeindia.mini_project.membership.ExistingMemberships;
import com.edubridgeindia.mini_project.membership.clearmembership.ClearMemberShip;
import com.edubridgeindia.mini_project.membership.exceptionhandling.ExceptionHandlingUpdateMember;
import com.edubridgeindia.mini_project.membership.exceptionhandling.ExceptionhandlingAddMember;
import com.edubridgeindia.mini_project.membership.viewmemberships.ViewMembersAsAdmin;
import com.edubridgeindia.mini_project.membership.viewmemberships.ViewMembersAsStudent;

public class LibraryImplementation {
	public void implement() throws InterruptedException {
		int option;
		int viewAs;
		int memberId;
		int bookId;
		String confirm;
		Scanner in=new Scanner(System.in);
		HashMap<Integer,List> currentMembers=new HashMap<>();
		HashMap<Integer,List> currentBooks=new HashMap<>();
		HashMap<Integer,List> issuedBooks=new HashMap<>();
		
		ExistingMemberships existingMembers=new ExistingMemberships();
		currentMembers=existingMembers.existingMembers();
		ExistingBooks existingBooks=new ExistingBooks();
		currentBooks=existingBooks.existingBooks();
		System.out.println("==================Welcome to Edu Bridge Library ================");
		try {
		do {
			System.out.println("----------------------------------------");
			Thread.sleep(2000);
			System.out.println("1.Add new Membership");
			System.out.println("2.View Membershipd details");
			System.out.println("3.update Membership detais");
			System.out.println("4.Close Membership");
			System.out.println("5.Add new Book");
			System.out.println("6.update Book");
			System.out.println("7.delete book details");
			System.out.println("0.Exit");
			System.out.println("----------------------------------------");
			System.out.println("Please enter the option:-");
			option=in.nextInt();
			switch (option) {
			case 1: {
				
				ExceptionhandlingAddMember addMember=new ExceptionhandlingAddMember();
				currentMembers=addMember.newMember(currentMembers);
				
				break;
				
			}
			case 2: {
				Thread.sleep(2000);
				System.out.println("1.View Members as Admin");
				System.out.println("2.View Members as Student");
				
				System.out.println("please enter the option you would like to view as");
				viewAs=in.nextInt();
				switch (viewAs) {
				case 1: {
					
					
					ViewMembersAsAdmin viewAdmin=new ViewMembersAsAdmin();
					viewAdmin.ViewMembAdmin(currentMembers);
					break;
				}
				case 2:{
					System.out.println("Please enter your Id");
					memberId=in.nextInt();
					ViewMembersAsStudent viewStudent=new ViewMembersAsStudent();
					viewStudent.viewMembersStudent(currentMembers,memberId);
					break;
				}
				
				default:
					System.out.println("please enter the above options only");
					
				}
				
				break;
			}
			case 3:{
				System.out.println("Please enter your Id");
				memberId=in.nextInt();
				ExceptionHandlingUpdateMember updateMember=new ExceptionHandlingUpdateMember();
				currentMembers=updateMember.updateMembers(currentMembers, memberId);
				System.out.println("Membership is updated Successfully");
				break;
			}
			case 4:{
				System.out.println("Please enter your Id that you want to remove");
				memberId=in.nextInt();
				System.out.println("Are you sure you want to remove this account [yes/no]");
				confirm=in.next();
				if(confirm.equalsIgnoreCase("yes")) {
					ClearMemberShip clearMember=new ClearMemberShip();
					clearMember.clearMember(currentMembers, memberId);
					Thread.sleep(2000);
					
				}
				
				break;
			}
			case 5:{
				ExceptionhandlingAddBooks addBooksInstance= new ExceptionhandlingAddBooks();
				currentBooks=addBooksInstance.addBooks(currentBooks);
						break;
			}
			case 6:{
				ExceptionHandlingUpdateBooks upadteBooks=new ExceptionHandlingUpdateBooks();
				System.out.println("Please Enter the Book id you would like to update");
				bookId=in.nextInt();
				Thread.sleep(2000);
				currentBooks=upadteBooks.updateBooks(currentBooks, bookId);
				System.out.println("Book is successfully updated");
				break;
			}
			case 7:{
				System.out.println("Please enter Book Id that you want to remove");
				bookId=in.nextInt();
				System.out.println("Are you sure you want to remove thisbook [yes/no]");
				confirm=in.next();
				if(confirm.equalsIgnoreCase("yes")) {
					ClearBooks clearBook=new ClearBooks();
					currentBooks=clearBook.removeBooks(currentBooks, bookId);
					
				}
				
				break;
			}
			case 0:{
				System.out.println("Are you sure you want to exit [yes/no]");
				confirm=in.next();
				if(confirm.equalsIgnoreCase("yes")) {
					
				Thread.sleep(2000);
				System.out.println("----------------Thanks for visiting Library--------------------");
				System.exit(0);
				}
				else {
					implement();
				}
			}
			case 9:{
				ViewBooks view=new ViewBooks();
				view.ViewBooksInfo(currentBooks);
				
				break;
			}
			case 10:{
				IssueBooksToMembers issueBooks=new IssueBooksToMembers();
				issuedBooks=issueBooks.callBooksMembers(currentMembers, currentBooks);
				break;
			}
			case 11:{
				ViewIssuedBooks viewIssued=new ViewIssuedBooks();
				viewIssued.view(issuedBooks);
				System.out.println("Book issued Successfully");
				break;
			}
			default:
				Thread.sleep(2000);
				System.out.println("Please enter the valid options only");
			}
			
			
		}while(option!=0 );
		}
		catch(InputMismatchException  e) {
			System.out.println("Please enter valid inputs only");
			implement();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		LibraryImplementation library=new LibraryImplementation();
		library.implement();
	}
}
