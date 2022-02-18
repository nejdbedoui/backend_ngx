package com.example.demo.repository;

import com.example.demo.entity.Ad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Adrep extends MongoRepository<Ad,String> {
}
