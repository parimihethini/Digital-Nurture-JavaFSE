package com.library.librarymanagementjpa.repository;

import com.library.librarymanagementjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}