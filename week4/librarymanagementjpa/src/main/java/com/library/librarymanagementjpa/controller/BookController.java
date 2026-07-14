package com.library.librarymanagementjpa.controller;

import com.library.librarymanagementjpa.entity.Book;
import com.library.librarymanagementjpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("/search/{name}")
    public List<Book> searchBook(@PathVariable String name) {
        return bookService.searchBook(name);
    }
}