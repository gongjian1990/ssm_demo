package com.gj.service.impl;

import com.gj.dao.BookDao;
import com.gj.entity.Book;
import com.gj.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements IBookService{

    @Autowired
    private BookDao bookDao;

    public Book getBook(int id){
        return bookDao.getBook(id);
    }
}
