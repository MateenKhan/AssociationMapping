package com.example.AssociationDemo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "books")

@Entity
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Book> books;

//    public BookCategory(String name, Book... books) {
//        this.name = name;
//        this.books = Stream.of(books).collect(Collectors.toSet());
//        this.books.forEach(x -> x.setBookCategory(this));
//    }
//
//    public BookCategory(){}
}