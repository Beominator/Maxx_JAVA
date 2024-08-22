package com.security.control;

import com.security.Dto.MemberDto;
import com.security.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControl {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/signUp")
    public String 회원가입페이지요청(Model model){
        model.addAttribute("memberDto", new MemberDto());
        return "signUp";
    }
}
