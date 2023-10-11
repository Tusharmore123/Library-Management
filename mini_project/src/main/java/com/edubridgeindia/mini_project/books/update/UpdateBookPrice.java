package com.edubridgeindia.mini_project.books.update;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateBookPrice {
	
	public HashMap update(HashMap currentBooks,int bookId) {
		float newBookPrice;
		if(currentBooks.get(bookId)!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter Book Price:-");
			newBookPrice=in.nextFloat();
			
			
			List member=(List)currentBooks.get(bookId);
			member.set(2, newBookPrice);
			}
		
		else {
			System.out.println("please enter the valid Id");
		}
		return currentBooks;
		
	}

}
