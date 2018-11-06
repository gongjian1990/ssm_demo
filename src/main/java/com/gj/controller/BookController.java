package com.gj.controller;

import com.gj.entity.Book;
import com.gj.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("/hello")
    public String hello(int id, ModelMap map){
        Book book = bookService.getBook(id);
        map.put("book",book);
        return "bookIndex";
    }
}
