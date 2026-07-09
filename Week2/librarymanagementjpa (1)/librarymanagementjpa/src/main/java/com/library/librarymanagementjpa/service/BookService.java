package com.library.librarymanagementjpa.service;

import com.library.librarymanagementjpa.entity.Book;
import com.library.librarymanagementjpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> searchBook(String name) {
        return bookRepository.findByNameContaining(name);
    }
}