package com.edubridgeindia.mini_project.books.update;

import java.util.HashMap;
import java.util.Scanner;

public class UpdateBooks {
	public HashMap updateBooksInfo(HashMap currentBooks,int bookId) {
		int option;
		Scanner in=new Scanner(System.in);
		if(currentBooks.get(bookId)==null){
			System.out.println("Please enter the valid Book Id");
			return currentBooks;
		}
		
		System.out.println("Please Select the options you would like to update");
		System.out.println("1.update Book Name");
		System.out.println("2.update Book id");
		System.out.println("3.update Book Price");
		System.out.println("4.update Book Author ");
		System.out.println("5.update Book All info ");
		
		option=in.nextInt();
		switch (option) {
		case 1: {
			UpdateBookName bookName=new UpdateBookName();
			currentBooks=bookName.update(currentBooks,bookId);
			
			break;
		}
		case 2: {
			UpdateBookId bookIdInstance=new UpdateBookId();
			currentBooks=bookIdInstance.update(currentBooks,bookId);
			System.out.println(currentBooks);
			break;
		}
		case 3: {
			UpdateBookPrice bookPrice=new UpdateBookPrice();
			currentBooks=bookPrice.update(currentBooks,bookId);
			
			break;
		}
		case 4: {
			UpdateBookAuthor bookAuthor=new UpdateBookAuthor();
			currentBooks=bookAuthor.update(currentBooks,bookId);
			
			break;
		}
		case 5: {
			UpdateBooksAllInfo bookAllInfo=new UpdateBooksAllInfo();
			currentBooks=bookAllInfo.update(currentBooks, bookId);
			
			break;
		}
		
		default:
			System.out.println("please enter valid options only");;
		}
		return currentBooks;
	}
	
}
