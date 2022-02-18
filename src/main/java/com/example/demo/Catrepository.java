package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Catrepository extends MongoRepository<Category,String> {
    Category findCategoryByNamec(String namec);

}
