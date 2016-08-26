package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class IndexController {
 
    @RequestMapping("/") //match to root path
    String ropa(){ //method name doesn't matter
        return "index"; //index.html in templates directory
    }
}

