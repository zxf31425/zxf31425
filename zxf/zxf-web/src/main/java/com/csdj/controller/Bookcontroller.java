package com.csdj.controller;

import com.csdj.pojo.BookInfo;
import com.csdj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Bookcontroller {
    @Autowired
    BookService service;
    @GetMapping("show")
    public List<BookInfo> show(){
       return service.getBook();
    }
}
