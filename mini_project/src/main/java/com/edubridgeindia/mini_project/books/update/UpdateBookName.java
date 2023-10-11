package com.edubridgeindia.mini_project.books.update;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateBookName {
	
	public HashMap update(HashMap currentBooks,int bookId) {
		String newBookName;
		if(currentBooks.get(bookId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter Book Name:-");
			newBookName=in.next();
			ValidatingValuseEntered validate=new ValidatingValuseEntered();
			if(!validate.isvalid(newBookName)) {
				in.close();
			}
			else {
			List member=(List)currentBooks.get(bookId);
			member.set(0, newBookName);
			}
		}
		else {
			System.out.println("please enter the valid Id");
		}
		return currentBooks;
		
	}

}
