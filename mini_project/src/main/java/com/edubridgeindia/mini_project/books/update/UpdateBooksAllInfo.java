package com.edubridgeindia.mini_project.books.update;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

public class UpdateBooksAllInfo {
	
	public HashMap update(HashMap currentBooks,int bookId) {
	Scanner in=new Scanner(System.in);
		
		ValidatingValuseEntered validate=new ValidatingValuseEntered();
		String bookName;
		String bookAuthor;
		
		float bookPrice;
		int bookNewId;
		
		
		
		System.out.println("Please enter book name:-");
		 bookName=in.next();
		if(!validate.isvalid(bookName)){
			in.close();
			
		}
		
		
		
		System.out.println("Please enter book Id:-");
		 bookNewId=in.nextInt();
		
		System.out.println("Please enter book price:-");
		 bookPrice=in.nextFloat();
		 in.nextLine();
		System.out.println("please enter book author name:-");
		bookAuthor=in.nextLine();
		if(!validate.isvalid(bookAuthor)){
			in.close();
			
		}
		
		List member=(List)currentBooks.get(bookId);
		member.set(0, bookName);
		member.set(1, bookNewId);
		member.set(2, bookPrice);
		member.set(3, bookAuthor);
		currentBooks.remove(bookId);
		currentBooks.put(bookNewId,member );
		
		return currentBooks;
		
	}

}
