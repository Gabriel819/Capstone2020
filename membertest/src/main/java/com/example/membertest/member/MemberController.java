package com.example.membertest.member;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping("/member")
    public List MemberList(){
        System.out.println("Member Connect Succeed.");
        List<Member> list = memberRepository.findAll();
        /*
        for (int i=0 ; i < list.size();i++) {
            System.out.println(i);
            System.out.println("user_idx : " + list.get(i).getUser_idx()
                                +"\nuser_name : "+list.get(i).getUser_name()
                                +"\nuser_phone : " + list.get(i).getUser_phone()
                                +"\nuser_email : "+list.get(i).getUser_email()
                                +"\nuser_id : "+list.get(i).getUser_id()
                                +"\nuser_pw : "+list.get(i).getUser_id()
                                +"\nuser_gender : "+list.get(i).getUser_gender()
                                +"\nuser_nickname : "+list.get(i).getUser_nickname()
                                +"\nstamp : "+list.get(i).getStamp());
        }
        */
            return list;
    }

}
