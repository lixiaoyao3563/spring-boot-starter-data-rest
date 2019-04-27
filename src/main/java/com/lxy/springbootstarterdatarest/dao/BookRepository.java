package com.lxy.springbootstarterdatarest.dao;

import com.lxy.springbootstarterdatarest.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    Book findByBookname(String name);

    @Query("{'bookname':'java'}")
    List<Book> withQueryFindByBookname(String name);

}
