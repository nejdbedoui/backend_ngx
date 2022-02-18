package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.repository.Clientrep;
import com.example.demo.service.Clients;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/client")
@AllArgsConstructor
public class Clientc {
    Clientrep clientrep;
    private final Clients clients;

    @Autowired
    public Clientc(Clients clients){
        this.clients=clients;
    }

    @GetMapping(value = "/getclient")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Client> Getclient(){
        return clients.Getclient();
    }


    @PostMapping(value = "/add_client")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Addclient(@RequestBody Client c)  {
        clients.addclient(c);
    }

    @PutMapping(value = "/update_client")
    @CrossOrigin(origins = "http://localhost:4200")
    public void Updateclient(@RequestBody Client c){
        clients.updatecl(c);
    }

    @DeleteMapping(value = "/delete_client/{idc}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deletecl(@PathVariable("idc") String id){
        clients.deletecl(id);
    }

}
