package com.example.demo.controller;

import com.example.demo.Category;
import com.example.demo.entity.Ad;
import com.example.demo.entity.Contract;
import com.example.demo.repository.Adrep;
import com.example.demo.service.Ads;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/ad")
@AllArgsConstructor
public class Adc {
    Adrep adrep;
    private final Ads ads;

    @Autowired
    public Adc(Ads ads){
        this.ads=ads;
    }

    @GetMapping(value = "/get_ad")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Ad> Getad(){
        return ads.Getad();
    }

    @PostMapping(value = "/add_ad")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Addad(@RequestBody Ad a)  {
        ads.addad(a);
    }

    @PutMapping(value = "/update_ad")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Update(@RequestBody Ad a){
        ads.updatead(a);
    }

    @DeleteMapping(value = "/delete_ad/{ida}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deletecl(@PathVariable("ida") String id) {
        ads.deletead(id);
    }
}
