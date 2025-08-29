package com.practice.service.entity;

import java.util.Collections;
import java.util.List;

public class BookService {

	public static void main(String[] args) {
		
		BookDao bookDao = new BookDao();
		MyComparator myComparator = new MyComparator();
		List<Book> bookList = bookDao.getBookList();

		//bookList.sort(myComparator);
		Collections.sort(bookList,(o1,o2)-> o1.getBookName().compareTo(o2.getBookName()));
		System.out.println(bookList);
	}

}
