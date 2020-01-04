package com.example.AssociationDemo.repository;

import com.example.AssociationDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
}