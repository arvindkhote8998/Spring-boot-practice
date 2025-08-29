package com.practice.service.Stream;

import java.util.List;
import java.util.stream.Collectors;

import com.practice.service.entity.Book;
import com.practice.service.entity.BookDao;

public class SteamPractice {

	BookDao bookDao = new BookDao();
	public List<Book> getData(){
		return bookDao.getBookList().stream().filter(book->book.getBookId() > 3).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SteamPractice steamPractice = new SteamPractice();
		System.out.println(steamPractice.getData());
	}

}
