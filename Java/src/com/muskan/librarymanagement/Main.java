package com.muskan.librarymanagement;

import com.muskan.librarymanagement.books.*;	// * is used when we have to import all the classes present inside that package.

public class Main {

	public static void main(String[] args) {

// We have created an object of Book and Staff class, therefore we have to mention the full package path of these classes where they are present.	
		com.muskan.librarymanagement.books.Book book = new com.muskan.librarymanagement.books.Book();
		com.muskan.librarymanagement.employee.Staff st = new com.muskan.librarymanagement.employee.Staff();
		
// To resolve this lengthy process, java has provided an "import" keyword to import that whole path.
// Once the package is imported then we can use the class multiple times.		
		
		Book b1 = new Book();
		
		String s = "hi";
		
	}

}
