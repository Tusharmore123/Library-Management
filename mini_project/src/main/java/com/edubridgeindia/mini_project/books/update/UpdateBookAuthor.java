package com.edubridgeindia.mini_project.books.update;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateBookAuthor {
	
	public HashMap update(HashMap currentBooks,int bookId) {
		String newBookAuthorName;
		if(currentBooks.get(bookId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter Book Author:-");
			newBookAuthorName=in.nextLine();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			if(!validate.isvalid(newBookAuthorName)) {
				in.close();
			}
			else {
			List member=(List)currentBooks.get(bookId);
			member.set(3, newBookAuthorName);
			}
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentBooks;
		
	}

}
