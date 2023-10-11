package com.edubridgeindia.mini_project.books.exceptionhandling;

import java.util.HashMap;
import java.util.InputMismatchException;

import com.edubridgeindia.mini_project.books.ExistingBooks;
import com.edubridgeindia.mini_project.books.update.UpdateBooks;
import com.edubridgeindia.mini_project.membership.membershipupdate.UpdateMemberShip;



public class ExceptionHandlingUpdateBooks {
	public HashMap updateBooks(HashMap currentBooks,int BookId) {
	try {
		UpdateBooks updateInstance=new UpdateBooks();
		currentBooks=updateInstance.updateBooksInfo(currentBooks, BookId);
	}
	catch(InputMismatchException e){
		updateBooks(currentBooks, BookId);
	}
	return currentBooks;
	}
	
}
