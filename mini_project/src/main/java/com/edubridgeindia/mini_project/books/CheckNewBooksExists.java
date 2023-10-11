package com.edubridgeindia.mini_project.books;

import java.util.HashMap;
import java.util.List;

public class CheckNewBooksExists {
	public boolean checkExists(HashMap currentBooks,int bookId ) {

		if(currentBooks.get(bookId)!=null) {
			return true;
		}
			
		
		
		return false;
	}
	
}
