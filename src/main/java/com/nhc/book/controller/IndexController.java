package com.nhc.book.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {



    @RequestMapping("/")
    public String toIndexPage(){return "index";}

    @RequestMapping("/head")
    public String toHeadPage(){
        return "head";
    }
    @RequestMapping("/foot")
    public String toFootPage(){
        return "foot";
    }
    @RequestMapping("/menu_search")
    public String toMenuSearchPage(){
        return "menu_search";
    }
}
