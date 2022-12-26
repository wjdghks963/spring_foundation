package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // http get => 8080/hello을 만든것과 같다.
    @GetMapping("hello")
    public String Hello(Model model){
        // templates의 data의 변수에 hello!라는 값을 초기화한다.
        model.addAttribute("data", "hello!");
        // static의 template/hello와 맵핑된것과 같다.
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam(value="name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello"+ name;
    }

    // api 생성
    // ResponseBody는 결과물을 json형태로 변환시켜 준다.
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }





}
