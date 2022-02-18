package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="api/cat01")
@AllArgsConstructor
public class Categcontroller {
    Catrepository catrepository;


    private final Categservice categservice;

    @Autowired
    public Categcontroller(Categservice categservice) {
        this.categservice = categservice;
    }

    //get all category
    @GetMapping(value = "/getcat02")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Category> Getcate(){
       return categservice.Getcat();
    }

    //add category
    @PostMapping(value = "/addcat03")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Addcateg(@RequestBody Category  c)  {
        categservice.addcateg(c);
    }

    //update category
    @PutMapping(value = "/updatec/{idc}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Update(@PathVariable("idc") String id,@RequestBody Category c){
        System.out.println(c);
        categservice.updatec(id,c);
    }

    //delete category
    @DeleteMapping(value = "/delete/{idc}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void delete(@PathVariable("idc") String id){

        categservice.delete(id);
    }
    //get cat by id
    @GetMapping(value = "/getcat/{idc}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Category getcat(@PathVariable("idc") String id){
        return categservice.getcat(id);
    }
    }
