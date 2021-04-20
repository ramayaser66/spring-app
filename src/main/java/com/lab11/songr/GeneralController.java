package com.lab11.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;


@Controller
public class GeneralController {



    @ResponseBody
    @GetMapping("/hello")
    public String responedToHelloWorld(){
        return "hello world";
    }


    @GetMapping("/")

    public String responedToHome(){
        return "home.html";
    }




    @GetMapping("/capitalize/{word}")
    public String showTemplate(Model m, @PathVariable("word") String word){

        m.addAttribute("word",word.toUpperCase());
        return "capitalized.html";
    }

}
