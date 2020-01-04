package com.example.AssociationDemo;

import com.example.AssociationDemo.model.Book;
import com.example.AssociationDemo.model.BookCategory;
import com.example.AssociationDemo.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//public class AssociationDemoApplication implements CommandLineRunner {
public class AssociationDemoApplication{

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(AssociationDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) {
//		bookCategoryRepository.save(new BookCategory("Category 1", new Book("Hello Koding 1"), new Book("Hello Koding 2")));
//	}
}
