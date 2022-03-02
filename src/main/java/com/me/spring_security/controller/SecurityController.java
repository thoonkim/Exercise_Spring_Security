package com.me.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "home";
    }


    /*웹 어플리케이션에서 /hello로 요청하면 이 메소드로 진행 한다.*/
    @GetMapping("/home")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "home";//이 리턴 값은 뷰리졸버가 templates의 리턴값과같은이름.html에 자동 화면을 찾아 처리한다.
    }

//    static class Hello {
//        private String name;
//        /*게터 세터는 자바빈규약 또는 프로퍼티접근 방식이라 한다.*/
//        public String getName() { //Alt+insert = 게터세터 추가
//            return name;
//            //꺼낼 때
//        }
//
//        public void setName(String name) {
//            this.name = name;
//            //넣을 때
//        }
//    }
//
//
}
