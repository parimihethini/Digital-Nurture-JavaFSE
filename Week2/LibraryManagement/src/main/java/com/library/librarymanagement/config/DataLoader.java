package com.library.librarymanagement.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.library.librarymanagement.entity.Book;
import com.library.librarymanagement.repository.BookRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(BookRepository repository) {

        return args -> {

            repository.save(new Book(1, "Java", "James Gosling"));
            repository.save(new Book(2, "Spring", "Rod Johnson"));
            repository.save(new Book(3, "Hibernate", "Gavin King"));

        };
    }
}