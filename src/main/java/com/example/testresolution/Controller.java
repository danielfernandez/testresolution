package com.example.testresolution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/")
    public ModelAndView root() {
        return new ModelAndView("/index.html");
    }


}
