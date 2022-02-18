package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class Categservice {
    private final Catrepository catrepository;

    //get all category
    public List<Category> Getcat(){
        return catrepository.findAll();
    }

    //add category
    public void addcateg(Category category) {
        category.setId(UUID.randomUUID().toString());
            catrepository.save(category);
    }


    public void updatec(String id, Category c) {
        Category cat=catrepository.findById(id).orElse(null);
        cat.setNamec(c.getNamec());
        catrepository.save(cat);
    }

    public void delete(String id) {
        catrepository.deleteById(id);
    }

    public Category getcat(String id) {
        return catrepository.findById(id).orElse(null);
    }
}
