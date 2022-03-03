package com.example.demo.controller;

import com.example.demo.entity.Ad;
import com.example.demo.entity.Client;
import com.example.demo.entity.Companie;
import com.example.demo.entity.Contract;
import com.example.demo.repository.Contractrep;
import com.example.demo.service.Contracts;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/contract")
@AllArgsConstructor
public class Contractc {
    Contractrep contractrep;
    private final Contracts contracts;
    @Autowired
    public Contractc(Contracts contracts){
        this.contracts=contracts;
    }
    @GetMapping(value = "/get_contract")
    @CrossOrigin(origins = "https://backendnejd.herokuapp.com/")
    public List<Contract> Getcontract(){
        return contracts.Getcontract();
    }

    @PostMapping(value = "/add_conract")
    @CrossOrigin(origins = "https://backendnejd.herokuapp.com/")
    public void Addcontract(@RequestBody Contract c)  {
        contracts.addcontract(c);
    }

    @PutMapping(value = "/update_contract")
    @CrossOrigin(origins = "https://backendnejd.herokuapp.com/")
    public void Updatecontract(@RequestBody Contract c){
        contracts.updatecontract(c);
    }

    @DeleteMapping(value = "/delete_contract/{idc}")
    @CrossOrigin(origins = "https://backendnejd.herokuapp.com/")
    public void deletecontract(@PathVariable("idc") String id){
        contracts.deletecontract(id);
    }


}
