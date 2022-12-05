package com.nest.productapp_backebd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {

    @PostMapping("/")
    public String Productadd()
    {
        return " Product adding page";
    }



}
