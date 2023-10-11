package com.edubridgeindia.mini_project.books.removebooks;

import java.util.HashMap;
import java.util.List;

import com.edubridgeindia.mini_project.interfaces.ClearMember;
import com.edubridgeindia.mini_project.interfaces.RemoveBooks;

public class ClearBooks implements RemoveBooks {

	
	@Override
	public HashMap removeBooks(HashMap currentBooks, int studentId) {
		// TODO Auto-generated method stub
if(currentBooks.get(studentId)!=null) {
			
			currentBooks.remove(studentId);
			System.out.println("book removed successfully");
			
		}
		else {
			System.out.println("invalid  Id");
		}
		
		return currentBooks;
	}

	

}
