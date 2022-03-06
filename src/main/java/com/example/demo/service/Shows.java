package com.example.demo.service;

import com.example.demo.entity.Contract;
import com.example.demo.entity.Show;
import com.example.demo.repository.Adrep;
import com.example.demo.repository.Contractrep;
import com.example.demo.repository.Showrep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Shows {
    private final Showrep showrep;
    private final Contractrep contractrep;
    private final Adrep adrep;

    public List<Show> Getall() {
        return showrep.findAll();
    }


    public void add(Contract contract) {
        System.out.println(contract);
        Contract c=contractrep.findById(contract.getId_contract()).orElse(null);
        Show s = new Show();

        String link=adrep.findById(c.getId_ad()).orElse(null).getLink();
        s.setLink(link);
        s.setStart_date(c.getStart_date());
        s.setEnd_date(c.getEnd_date());
        showrep.save(s);
    }
}
