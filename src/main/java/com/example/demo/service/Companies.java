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
        c.setId_companie(null);
        companierep.save(c);
    }

    public void updatecomp(Companie c) {
        Companie c1=companierep.findById(c.getId_companie()).orElse(null);
        c1.setEmail(c.getEmail());
        c1.setFull_name(c.getFull_name());
        c1.setPhone_number(c.getPhone_number());
        companierep.save(c1);
    }

    public void deletecomp(String id) {
        companierep.deleteById(id);
    }
}
