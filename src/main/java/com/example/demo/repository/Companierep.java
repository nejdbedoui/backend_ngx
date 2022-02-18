package com.example.demo.repository;

import com.example.demo.entity.Companie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Companierep extends MongoRepository<Companie,String> {
}
