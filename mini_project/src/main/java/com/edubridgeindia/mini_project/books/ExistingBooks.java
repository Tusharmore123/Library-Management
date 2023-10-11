package com.edubridgeindia.mini_project.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExistingBooks  {
	public HashMap<Integer, List> existingBooks() {
		CreateNewBook createBooksInstance=new CreateNewBook();
		
		HashMap <Integer,List> existingBooks=new HashMap();
		existingBooks.put(1,createBooksInstance.createNewBooks("HalfGirlFriend", 1,1235,"ChetanBhagat"));
		existingBooks.put(2,createBooksInstance.createNewBooks("Chitra",2,4545,"RabindraNath"));
		existingBooks.put(3,createBooksInstance.createNewBooks("OneIndianGirl",3,37483,"ChetanBhagat"));
		existingBooks.put(4,createBooksInstance.createNewBooks("ACallOfHonour",4,4500,"JaswantSingh"));
		existingBooks.put(5,createBooksInstance.createNewBooks("Idols",5,4510,"SunilGavaskar"));
		
		return existingBooks;
	}
	
}
