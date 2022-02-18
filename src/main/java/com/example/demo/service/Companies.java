package com.example.demo.service;

import com.example.demo.entity.Companie;
import com.example.demo.repository.Companierep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Companies {
    private final Companierep companierep;
    public List<Companie> Getcompanie() {
        return companierep.findAll();
    }

    public void addcompanie(Companie c) {
        companierep.save(c);
    }
}
