package com.example.demo.service;

import com.example.demo.entity.Ad;
import com.example.demo.repository.Adrep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Ads {
    private final Adrep adrep;

    public List<Ad> Getad() {
        return adrep.findAll();
    }

    public void addad(Ad a) {
        a.setId_ad(null);
        adrep.save(a);
    }

    public void updatead(Ad a) {
        String id=a.getId_ad();
        Ad ad=adrep.findById(id).orElse(null);
        ad.setLink(a.getLink());
        adrep.save(ad);
    }

    public void deletead(String id) {
        adrep.deleteById(id);
    }
}
