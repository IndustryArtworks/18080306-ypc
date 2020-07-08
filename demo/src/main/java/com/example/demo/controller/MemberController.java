package com.example.demo.controller;

import com.example.demo.entity.Goods;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {


    @Autowired
    private MemberService memberService;

    @GetMapping("/index2")
    public String index(Model model) {
        model.addAttribute("member", new Member());
        return "index2";
    }

    @PostMapping("/member/insert")
    public String insert(@ModelAttribute("member") Member member) {
        memberService.insert(member);
        return "redirect:/member/getAllMember";
    }

    @GetMapping("/member/getAllMember")
    public String getAllEmployee(Model model) {
        model.addAttribute("memberList", memberService.getAllMember());
        return "memberlist";
    }
}
