package com.example.demo;


import lombok.Data;



@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private int tproduct;
    private double price;
    private String image;
    private int promo;

    public Product(String id, String name, String description, int tproduct, double price, String image, int promo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tproduct = tproduct;
        this.price = price;
        this.image = image;
        this.promo = promo;
    }
}
