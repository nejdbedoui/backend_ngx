package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Contract {
    @Id
    private String id_contract;
    private String id_client;
    private String id_Companie;
    private String id_ad;
    private int loop;
    private int days;
    private Date start_date;
    private Date end_date;

}
