package com.example.AssociationDemo.repository;

import com.example.AssociationDemo.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{
}