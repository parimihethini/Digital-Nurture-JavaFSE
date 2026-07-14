package com.library.librarymanagementjpa;

import com.library.librarymanagementjpa.entity.Book;
import com.library.librarymanagementjpa.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibrarymanagementjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarymanagementjpaApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(BookRepository repository) {
        return args -> {
            repository.save(new Book(1L, "Java", "James Gosling"));
            repository.save(new Book(2L, "Spring", "Rod Johnson"));
            repository.save(new Book(3L, "Python", "Guido van Rossum"));
        };
    }
}