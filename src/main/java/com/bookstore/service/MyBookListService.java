package com.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository myBook;
	
	public void saveMyBooks(MyBookList myBookList) {
		myBook.save(myBookList);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBook.findAll();
	}
	
	public void deleteById(int id) {
		myBook.deleteById(id);
	}
}
