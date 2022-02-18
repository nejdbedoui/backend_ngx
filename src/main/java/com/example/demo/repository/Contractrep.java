package com.example.demo.repository;

import com.example.demo.entity.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Contractrep extends MongoRepository<Contract,String> {
}
