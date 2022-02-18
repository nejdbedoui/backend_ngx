package com.example.demo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="api/prod")
@AllArgsConstructor
public class Prodcontroller {

    Productrepository productrepository;
    private final Prodservice prodservice;

    @Autowired
    public Prodcontroller(Prodservice prodservice) {
        this.prodservice = prodservice;

    }

    //get product
    @GetMapping(value = "/getprod/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Product> Getprod(@PathVariable("id") String id){
        return prodservice.Getprod(id);
    }

    //add product
    @PostMapping(value = "/appprod2/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Addp(@RequestBody Product p , @PathVariable("id") String id){
        prodservice.addprod(p,id);
    }

    //delete product
    @DeleteMapping(path = "{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteprod(@PathVariable("id") String id,@RequestBody String id2){
        prodservice.deleteprod(id,id2);
    }

    //update product
    @PutMapping(value = "/update/{idc}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Update(@PathVariable("idc") String id,@RequestBody Product p){
        System.out.println("do");
        System.out.println(p);
        prodservice.update(id,p);
    }

    //get product by id
    @GetMapping(value = "/findp/{idc}/{idp}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Product findp(@PathVariable("idc") String idc,@PathVariable("idp") String idp){
        return prodservice.findprod(idc,idp);
    }
}
