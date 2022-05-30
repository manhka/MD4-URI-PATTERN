package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
    @GetMapping("/car?/s?o?/info?")
    public String info1(Model model){
        model.addAttribute("message","demo uri pattern!" +
                ",   ?=1 kí tự" +
                ",  *= 0 or nhiều kí tự" +
                ",  **=0 or nhiều phần của đường dẫn");
        return "/index";
    }
    @RequestMapping("/car*/sh*/info2")
    public ModelAndView info2(){
        ModelAndView model=new ModelAndView("/index");
        model.addObject("message","info222222222");
        return model;
    }
}
