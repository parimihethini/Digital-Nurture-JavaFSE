package com.library.librarymanagementjpa.config;

import com.library.librarymanagementjpa.entity.Book;
import com.library.librarymanagementjpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) {

        bookRepository.save(new Book(1L, "Java", "James Gosling"));
        bookRepository.save(new Book(2L, "Spring", "Rod Johnson"));
        bookRepository.save(new Book(3L, "Hibernate", "Gavin King"));

    }
}