package com.example.demo;

import com.mongodb.lang.Nullable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
public class Category {
    private String id;
    @Indexed(unique = true)
    private String namec;
    @Nullable
    private List<Product> pro;


}
