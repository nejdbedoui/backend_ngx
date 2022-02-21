package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.entity.Contract;
import com.example.demo.repository.Contractrep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Contracts {
    private final Contractrep contractrep;
    public List<Contract> Getcontract() {
        return contractrep.findAll();
    }

    public void addcontract(Contract c) {
        c.setId_contract(null);
        contractrep.save(c);
    }

    public void updatecontract(Contract c) {
        String id=c.getId_ad();
        Contract c1=contractrep.findById(id).orElse(null);
        c1.setId_ad(c.getId_ad());
        c1.setStart_date(c.getStart_date());
        c1.setEnd_date(c.getEnd_date());
        c1.setDays(c.getDays());
        c1.setLoop(c.getLoop());
        c1.setId_Companie(c.getId_Companie());
        contractrep.save(c1);
    }

    public void deletecontract(String id) {
        contractrep.deleteById(id);
    }
}
