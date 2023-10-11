package com.edubridgeindia.mini_project.books.exceptionhandling;

import java.util.HashMap;
import java.util.InputMismatchException;

import com.edubridgeindia.mini_project.books.AddNewBooks;
import com.edubridgeindia.mini_project.membership.AddNewMembership;

class InputInValid extends RuntimeException{
	InputInValid(String msg){
		super(msg);
		System.out.println("enter valid values only");
		
	}
}


public class ExceptionhandlingAddBooks {
	public static HashMap addBooks(HashMap currentBooks){
		AddNewBooks addBook = new AddNewBooks();

		
		try {
			currentBooks=addBook.getBooksInfo(currentBooks);
		} catch (InputMismatchException e) {
			addBooks(currentBooks);
		}
		
		return currentBooks;
	}
}
