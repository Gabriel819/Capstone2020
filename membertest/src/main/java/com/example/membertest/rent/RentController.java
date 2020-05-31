package com.example.membertest.rent;

import java.util.List;

import com.example.membertest.rent.Rent;
import com.example.membertest.rent.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentController {
    @Autowired
    private RentRepository rentRepository;

    @RequestMapping("/rent")
    public List RentList(){
        System.out.println("Rent Connect Succeed.");
        List<Rent> list = rentRepository.findAll();

        for (int i=0 ; i < list.size();i++) {
            System.out.println(i);
            System.out.println("rent_idx : " + list.get(i).getIdx()
                                +"cabinet_idx : " + list.get(i).getCabinet_idx()
                                +"\nuser_idx : "+list.get(i).getUser_idx()
                                +"\nstart_time : " + list.get(i).getStart_time()
                                +"\nend_time : "+list.get(i).getEnd_time()
                                +"\nimage : "+list.get(i).getImage());
        }

        return list;
    }

}
