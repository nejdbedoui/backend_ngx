package com.example.demo.controller;


import com.example.demo.entity.Contract;
import com.example.demo.entity.Show;
import com.example.demo.repository.Showrep;
import com.example.demo.service.Shows;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/show")
@AllArgsConstructor
public class Showc {
    Showrep showrep;
    private final Shows shows1;


    @Autowired
    public Showc(Shows shows){
        this.shows1=shows;
    }


    @GetMapping(value = "/get_shows")
    @CrossOrigin(origins = "*")
    public List<Show> Getall(){
        return shows1.Getall();
    }

    @PostMapping(value = "/add_show")
    @CrossOrigin(origins = "*")
    public void Addshow(@RequestBody Contract contract)  {
        shows1.add(contract);
    }



}
