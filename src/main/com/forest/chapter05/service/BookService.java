package com.forest.chapter05.service;

import com.forest.chapter05.domain.Book;
import com.forest.chapter05.domain.Category;

import java.util.List;

public interface BookService {

    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNextId();

}
