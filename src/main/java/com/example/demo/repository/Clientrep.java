package com.example.demo.repository;

import com.example.demo.entity.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Clientrep extends MongoRepository<Client,String> {
}
