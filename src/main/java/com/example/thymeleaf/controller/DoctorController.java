package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctorForm(Model model) {
        model.addAttribute("doctor", new Doctor(0, "John Smith"));
        return "doctor";
    }

    @PostMapping("/doctor")
    public String createDoctor(@ModelAttribute("doctor") Doctor doctor, Model model) {
        String name = doctor.getName() != null && !doctor.getName().isEmpty() ? doctor.getName() : "John Smith";
        int number = doctor.getNumber() != 0 ? doctor.getNumber() : 0;
        doctor.setName(name);
        doctor.setNumber(number);
        model.addAttribute("doctor", doctor);
        if (name.equals("John Smith") || number == 0) {
            model.addAttribute("message", "Please enter a name and number");
        }
        return "doctor";
    }

}
