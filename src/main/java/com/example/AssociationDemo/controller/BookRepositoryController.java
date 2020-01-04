package com.example.AssociationDemo.controller;

import com.example.AssociationDemo.model.Book;
import com.example.AssociationDemo.model.BookCategory;
import com.example.AssociationDemo.repository.BookCategoryRepository;
import com.example.AssociationDemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class BookRepositoryController {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @PostMapping("/asdf")
    public BookCategory asdf(@RequestBody BookCategory bookCategory){
//        int len = bookCategory.getBooks().size();
//        for (int i = 0; i < len; i++) {
//            System.out.println("len:::::::::::::::::::::::::::::::::::::::::::::::::::::"+len);
//            bookCategory.getBooks().get(i).setBookCategory(bookCategory);
//        }
        return bookCategoryRepository.save(bookCategory);
    }

    @GetMapping("/asdf")
    public List<BookCategory> asdfs(){
        return bookCategoryRepository.findAll();
    }
}
