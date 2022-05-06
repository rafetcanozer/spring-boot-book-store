package com.bookstore.springbootbookstore.service;

import com.bookstore.springbootbookstore.entity.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
