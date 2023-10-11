package com.edubridgeindia.mini_project.books.displaybooks;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ViewBooks {
	public void ViewBooksInfo(HashMap currentBooks) {
		Set<Object> eachBook=currentBooks.keySet();
		 
		FormatBooksInfo displayInstance=new FormatBooksInfo();
		int flag=0;
		for(Object displayBook:eachBook) {
			
			List books=(List) currentBooks.get(displayBook);
			if(flag==0) {
			String bookName=displayInstance.formatStringInfo(books.get(0).toString());
			String bookId=displayInstance.formatStringInfo(books.get(1).toString());
			String bookPrice=displayInstance.formatStringInfo(books.get(2).toString());
			String bookAuthor=displayInstance.formatStringInfo(books.get(3).toString());
			
			System.out.println("==================================Books Details===================================================");
			List membersInfo=(List) currentBooks.get(displayBook);
			System.out.print("||"+"     BookName:-     "+"||");
			System.out.print("||"+"     BookId         "+"||");
			System.out.print("||"+"   BookPrice:-      "+"||");
			System.out.print("||"+"  Book Author:-     "+"||");
			
			System.out.println();
			System.out.println("==================================================================================================");
			
			System.out.print("||"+bookName+"||");
			System.out.print("||"+bookId+"||");
			System.out.print("||"+bookPrice+"||");
			System.out.print("||"+bookAuthor+"||");
			
			System.out.println();
			System.out.println("==================================================================================================");
			flag=1;
			}
			else {
				String bookName=displayInstance.formatStringInfo(books.get(0).toString());
				String bookId=displayInstance.formatStringInfo(books.get(1).toString());
				String bookPrice=displayInstance.formatStringInfo(books.get(2).toString());
				String bookAuthor=displayInstance.formatStringInfo(books.get(3).toString());
				
				
				List booksInfo=(List) currentBooks.get(displayBook);
				System.out.print("||"+bookName+"||");
				System.out.print("||"+bookId+"||");
				System.out.print("||"+bookPrice+"||");
				System.out.print("||"+bookAuthor+"||");
				
				System.out.println();
				System.out.println("==================================================================================================");
				
			}
		}
			
		
	}
}
