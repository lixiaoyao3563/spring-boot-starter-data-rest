package com.lxy.springbootstarterdatarest.controller;

import com.lxy.springbootstarterdatarest.dao.BookRepository;
import com.lxy.springbootstarterdatarest.domain.Book;
import com.lxy.springbootstarterdatarest.domain.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/savebook")
    public Book save(){
        Book b= new Book("101", "java");
        Collection<Index> indices =  new LinkedHashSet<Index>();
        Index in1 = new Index("java介绍","1");
        Index in2 = new Index("java基础","20");
        indices.add(in1);
        indices.add(in2);
        b.setIndices(indices);

        return bookRepository.save(b);
    }

    @RequestMapping("/q1book")
    public Book q1(String name){
        return bookRepository.findByBookname(name);
    }

    @RequestMapping("/q2book")
    public List<Book> q2(String name){
        return bookRepository.withQueryFindByBookname(name);
    }


}
