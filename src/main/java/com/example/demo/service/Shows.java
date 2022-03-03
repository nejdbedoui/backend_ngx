package com.example.demo.service;

import com.example.demo.entity.Show;
import com.example.demo.repository.Showrep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Shows {
    private final Showrep showrep;

    public List<Show> Getall() {
        return showrep.findAll();
    }


    public void add(Show s) {
        s.setId_show(null);
        showrep.save(s);
    }
}
