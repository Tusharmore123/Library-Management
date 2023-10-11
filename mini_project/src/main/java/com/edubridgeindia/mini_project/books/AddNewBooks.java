package com.edubridgeindia.mini_project.books;

import com.edubridgeindia.mini_project.interfaces.AddNewBooksInterface;
import com.edubridgeindia.mini_project.membership.ValidatingValuseEntered;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class AddNewBooks implements AddNewBooksInterface{



	@Override
	public HashMap getBooksInfo(HashMap currentBooks) {
		// TODO Auto-generated method stub
		
		ValidatingValuseEntered validate=new ValidatingValuseEntered();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter Book name:-");
		String bookName=in.next();
		if(!validate.isvalid(bookName)){
			in.close();
			
		}
		
		System.out.println("Please enter Book Id:-");
		int bookId=in.nextInt();
		
		System.out.println("Please enter Book Price:-");
		float bookPrice=in.nextFloat();
		
		System.out.println("Please enter Book Author name:-");
		String bookAuthor=in.next();
		if(!validate.isvalid(bookAuthor)){
			in.close();
			
		}
		
		currentBooks=addNewBooks(bookName, bookId, bookPrice, bookAuthor,currentBooks);
		
		return currentBooks;
	}

	@Override
	public HashMap addNewBooks(String bookName, int bookId, float bookPrice, String bookAuthor,HashMap currentBooks) {
		// TODO Auto-generated method stub
		CreateNewBook createBookInstance=new CreateNewBook();
		CheckNewBooksExists checkBookInstance=new CheckNewBooksExists();
		List newMemberCreated=createBookInstance.createNewBooks(bookName, bookId, bookPrice, bookAuthor);
				;
		
		
		
		if(checkBookInstance.checkExists(currentBooks, bookId)){
			System.out.println("Book already exists");
		}
		else {
			currentBooks.put(bookId,newMemberCreated);
		
		System.out.println("books added successfully");
		
		}
		return currentBooks;
	}

}
