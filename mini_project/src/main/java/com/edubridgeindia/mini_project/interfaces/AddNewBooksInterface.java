package com.edubridgeindia.mini_project.interfaces;

import java.util.HashMap;

public interface AddNewBooksInterface{
	public HashMap getBooksInfo(HashMap currentBooks);
	public HashMap addNewBooks(String bookName, int bookId, float bookPrice,String bookAuthor,HashMap currentBooks);

}
