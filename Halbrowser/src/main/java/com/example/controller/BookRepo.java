package com.example.controller;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Book;

@RepositoryRestResource
(path = "books" , collectionResourceRel = "books")
public interface BookRepo extends JpaRepository<Book, Integer> {

}
