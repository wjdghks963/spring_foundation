package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// Controller 어노테이션은 spring container에서 관리된다. => bin
@Controller
public class MemberController {

    private final MemberService memberService;

    // Autowired 어노테이션은 spring container에서 memberService를 가져옴 => DI
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

}
