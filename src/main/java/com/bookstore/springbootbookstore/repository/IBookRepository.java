package com.bookstore.springbootbookstore.repository;

import com.bookstore.springbootbookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {



}
