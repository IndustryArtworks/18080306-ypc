package com.example.demo.service;


import com.example.demo.entity.Goods;
import com.example.demo.entity.Member;

import java.util.List;

public interface MemberService {
    String insert(Member member);
    List<Member> getAllMember();
}
