package com.example.demo.service.impl;

import com.example.demo.dao.MemberDAO;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDAO memberDAO;

    public String insert(Member member) {
        memberDAO.save(member);
        return null;
    }

    @Override
    public List<Member> getAllMember() {
        return memberDAO.findAll();
    }
}
