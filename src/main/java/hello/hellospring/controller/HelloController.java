package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    // http get, template mapping => 8080/hello을 만들고 template/hello와 맵핑된것과 같다.
    @GetMapping("hello")
    public String Hello(Model model){
        // templates의 data의 변수에 hello!라는 값을 초기화한다.
        model.addAttribute("data", "hello!");
        return "hello";
    }
}
