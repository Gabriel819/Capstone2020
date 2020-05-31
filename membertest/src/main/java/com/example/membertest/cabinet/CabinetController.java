package com.example.membertest.cabinet;

import java.util.List;

import com.example.membertest.cabinet.Cabinet;
import com.example.membertest.cabinet.CabinetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabinetController {
    @Autowired
    private CabinetRepository cabinetRepository;

    @RequestMapping("/cabinet")
    public List CabinetList(){
        System.out.println("Cabinet Connect Succeed.");
        List<Cabinet> list = cabinetRepository.findAll();

        for (int i=0 ; i < list.size();i++) {
            System.out.println(i);
            System.out.println("cabinet_idx : " + list.get(i).getCabinet_idx()
                    +"\ncabinet_name : " + list.get(i).getCabinet_name()
                    +"\nlatitude : "+list.get(i).getLatitude()
                    +"\nlongitude : " + list.get(i).getLongitude());
        }

        return list;
    }
}
