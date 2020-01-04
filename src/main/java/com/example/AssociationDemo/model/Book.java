package com.example.AssociationDemo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.*;

import javax.persistence.*;

@Data

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private BookCategory bookCategory;

//    @JsonCreator
//    public Book(String name) {
//        this.name = name;
//    }
//
//    public Book(){}
}