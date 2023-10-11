package com.edubridgeindia.mini_project.books.IssueBooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.books.displaybooks.ViewBooks;

public class IssueBooksToMembers {
	
	public HashMap callBooksMembers(HashMap currentMembers,HashMap currentBooks) {
		int studentId;
		int bookId;
		HashMap<Integer,List<List>> issuedBooks=null;
		System.out.println("Please enter your Id");
		Scanner in=new Scanner(System.in);
		studentId=in.nextInt();
		
		if(currentMembers.get(studentId)!=null) {
			ViewBooks viewBooksInstance=new ViewBooks();
			viewBooksInstance.ViewBooksInfo(currentBooks);
			System.out.println("please enter the book Id you would like to Issue");
			bookId=in.nextInt();
			if(currentBooks.get(bookId)!=null) {
				 issuedBooks=issueBook(currentMembers,currentBooks, studentId,bookId );
				 return issuedBooks;
				 
			}
			else {
				System.out.println("Please enter the valid Book Id");
			}
		}
		else {
			System.out.println("Please enter the valid Member Id");
			System.exit(0);
		}
		return issuedBooks;
	}
	public HashMap issueBook(HashMap currentMembers,HashMap currentBooks,int studentId ,int bookId) {
		
			HashMap<Integer,List<List>> issuedBooks=new HashMap<>();
			ArrayList members=(ArrayList) currentMembers.get(studentId);
			ArrayList books=(ArrayList) currentBooks.get(bookId);
			members.addAll(books);
			issuedBooks.put(studentId,members);
		
		return issuedBooks;
	}
	
}
