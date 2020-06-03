package com.example.test2.member;
import java.util.List;

public interface MemberService {
    List<Member> retrieveMember() throws Exception;
    List<Member> retrieveMember(Auth auth) throws Exception;
}
