package com.edubridgeindia.mini_project.books.update;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateBookId {
	
	public HashMap update(HashMap currentBooks,int bookId) {
		int newBookId;
		if(currentBooks.get(bookId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter Book id:-");
			newBookId=in.nextInt();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			
			List member=(List)currentBooks.get(bookId);
			member.set(1, newBookId);
			currentBooks.put(newBookId, member);
			currentBooks.remove(bookId);
			
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentBooks;
		
	}

}
