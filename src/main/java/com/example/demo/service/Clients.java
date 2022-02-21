package com.example.demo.service;


import com.example.demo.entity.Client;
import com.example.demo.repository.Clientrep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Clients {
    private final Clientrep clientrep;
    public List<Client> Getclient() {
        return clientrep.findAll();
    }

    public void addclient(Client c) {
        c.setId_client(null);
        clientrep.save(c);
    }

    public void updatecl(Client c) {
        String id=c.getId_client();
        Client cl1=clientrep.findById(id).orElse(null);
        cl1.setEmail(c.getEmail());
        cl1.setFull_name(c.getFull_name());
        cl1.setPhone_number(c.getPhone_number());
        clientrep.save(cl1);
    }

    public void deletecl(String id) {
        clientrep.deleteById(id);
    }
}
