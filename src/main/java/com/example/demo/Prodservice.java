package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class Prodservice {
    private final Productrepository productrepository;
    private final Catrepository catrepository;

    //get all product
    public List<Product> Getprod(String id){
        Category cat=catrepository.findById(id).orElse(null);
        return cat.getPro();
    }

    //add product
    public void addprod(Product p,String id) {
        Product p1=new Product(UUID.randomUUID().toString(),p.getName(),p.getDescription(),p.getTproduct(),p.getPrice(),p.getImage(),p.getPromo());
        Category cat=catrepository.findById(id).orElse(null);
        if (cat.getPro() == null) {
            List<Product> list = new ArrayList<>();
            list.add(p1);
            cat.setPro(list);
        }
        else
            cat.getPro().add(p1);
        catrepository.save(cat);
    }

    //delete product by id
    public void deleteprod(String idc,String idp) {
        Category cat=catrepository.findById(idc).orElse(null);
        for(Product prod : cat.getPro()){
            if(prod.getId().equals(idp)){
                cat.getPro().remove(prod);
                catrepository.save(cat);
                break;
            }
        }
    }
    public Product findprod(String idc,String idp) {
        Category cat = catrepository.findById(idc).orElse(null);
        Product p = null;
        for (Product prod : cat.getPro()) {
            if (prod.getId().equals(idp)) {
                p = prod;
                return p;

            }
        }
        return p;
    }

    //update product by id
    public void update(String id, Product p) {
        Category cat=catrepository.findById(id).orElse(null);
        System.out.println("p upd");
        System.out.println(p);
        for(Product prod : cat.getPro()){
            if(prod.getId().equals(p.getId())){
                prod.setName(p.getName());
                prod.setDescription(p.getDescription());
                prod.setPromo(p.getPromo());
                prod.setPrice(p.getPrice());
                prod.setPromo(p.getPromo());
                prod.setImage(p.getImage());
                catrepository.save(cat);
                break;
            }
        }
    }
}
