package com.library.librarymanagementjpa.repository;

import com.library.librarymanagementjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String author);

    List<Book> findByNameContaining(String name);
}