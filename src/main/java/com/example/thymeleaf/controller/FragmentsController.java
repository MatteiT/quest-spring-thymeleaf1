package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FragmentsController  {

    @GetMapping("/header")
    public String getHeader() {
        return "fragments/header";
    }

    @GetMapping("/footer")
    public String getFooter() {
        return "fragments/footer";
    }


    @GetMapping("/doctor")
    public String getDoctor() {
        return "doctor";
    }

}
