package com.practice.service.entity;

import java.util.Arrays;
import java.util.List;

public class BookDao {

	public List<Book> getBookList(){
		Book b = new Book(1,"Java","Arvind");
		Book b1 = new Book(2,"Webservice","Shamrao");
		Book b2 = new Book(4,"Docker","Singh");
		Book b3 = new Book(3,"Python","Paka");
		List<Book> list = Arrays.asList(b,b1,b2,b3);
		return list;
	}
}
