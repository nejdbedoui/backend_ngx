package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Ad {

    @Id
    private String id_ad;
    private String title;
    private String id_client;
    private String link;
}
