package com.lxy.springbootstarterdatarest.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

@Document
public class Book {

    private String bookid;
    private String bookname;
    @Field("indices")
    private Collection<Index> indices = new LinkedHashSet<Index>();

    public Book(String bookid, String bookname) {
        super();
        this.bookid = bookid;
        this.bookname = bookname;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Collection<Index> getIndices() {
        return indices;
    }

    public void setIndices(Collection<Index> indices) {
        this.indices = indices;
    }
}
