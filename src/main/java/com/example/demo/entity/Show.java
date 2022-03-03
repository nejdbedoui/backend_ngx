package com.example.demo.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Show {
    @Id
    private String id_show;
    private String link;
    private Date start_date;
    private Date end_date;
}
