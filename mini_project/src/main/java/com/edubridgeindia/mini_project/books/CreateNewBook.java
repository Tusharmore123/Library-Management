package com.edubridgeindia.mini_project.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CreateNewBooks{
	public List createNewBooks(String bookName,int bookId,float bookPrice,String bookAuthor);
}
public class CreateNewBook implements CreateNewBooks {

	@Override
	public List createNewBooks(String bookName, int bookId, float bookPrice,String bookAuthor) {
		// TODO Auto-generated method stub
		
		AddNewBooks addNewBookInstance=new AddNewBooks();
		
		BooksDetails newBooksInstance=new BooksDetails(bookName,bookId,bookPrice,bookAuthor);
		ArrayList books=new ArrayList();
		books.add(newBooksInstance.getBookName());
		books.add(newBooksInstance.getBookId());
		books.add(newBooksInstance.getBookPrice());
		books.add(newBooksInstance.getBookAuthor());
		
		
		return books;
		
	}
	
	
	
}
