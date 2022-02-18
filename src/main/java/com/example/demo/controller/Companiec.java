package com.example.demo.controller;

import com.example.demo.entity.Ad;
import com.example.demo.entity.Companie;
import com.example.demo.repository.Companierep;
import com.example.demo.service.Companies;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/comp")
@AllArgsConstructor
public class Companiec {
    Companierep companierep;
    private final Companies companies;

    @Autowired
    public Companiec(Companies companies){
        this.companies=companies;
    }

    @GetMapping(value = "/get_Companies")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Companie> Getcompanie(){
        return companies.Getcompanie();
    }

    @PostMapping(value = "/add_Companie")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Addcompanie(@RequestBody Companie c)  {
        companies.addcompanie(c);
    }
}
