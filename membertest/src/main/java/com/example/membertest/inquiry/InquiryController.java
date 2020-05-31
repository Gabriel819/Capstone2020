package com.example.membertest.inquiry;

import java.util.List;

import com.example.membertest.inquiry.Inquiry;
import com.example.membertest.inquiry.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquiryController {
    @Autowired
    private InquiryRepository inquiryRepository;

    @RequestMapping("/inquiry")
    public List InquiryList(){
        System.out.println("Inquiry Connect Succeed.");
        List<Inquiry> list = inquiryRepository.findAll();

        for (int i=0 ; i < list.size();i++) {
            System.out.println(i);
            System.out.println("inquiry_idx : " + list.get(i).getIdx()
                    +"\nrequest_date : " + list.get(i).getRequest_date()
                    +"\nuser_idx : "+list.get(i).getUser_idx()
                    +"\ntitle : "+list.get(i).getTitle()
                    +"\ncontent : " + list.get(i).getContent()
                    +"\nrequest_image : "+list.get(i).getRequest_image());
        }
        System.out.println(list);
        return list;
    }
}