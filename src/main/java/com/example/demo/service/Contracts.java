package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.entity.Contract;
import com.example.demo.repository.Adrep;
import com.example.demo.repository.Clientrep;
import com.example.demo.repository.Contractrep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Contracts {
    private final Contractrep contractrep;
    private final Adrep adrep;
    private final Clientrep clientrep;
    public List<Contract> Getcontract() {
        return contractrep.findAll();
    }

    public void addcontract(Contract c) {
        c.setId_contract(null);
        c.setAd(adrep.findById(c.getAd().getId_ad()).orElse(null));
        c.setClient(clientrep.findById(c.getClient().getId_client()).orElse(null));
        c.setCompanie(companierep.findById(c.getCompanie().getId_companie()).orElse(null));
        contractrep.save(c);
    }

    public void updatecontract(Contract c) {
        String id=c.getId_contract();
        Contract c1=contractrep.findById(id).orElse(null);
        c1.setAd(c.getAd());
        c1.setStart_date(c.getStart_date());
        c1.setEnd_date(c.getEnd_date());
        c1.setDays(c.getDays());
        c1.setLoop(c.getLoop());
        c1.setCompanie(c.getCompanie());
        contractrep.save(c1);
    }

    public void deletecontract(String id) {
        contractrep.deleteById(id);
    }
}
