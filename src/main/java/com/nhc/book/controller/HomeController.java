package com.nhc.book.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String toHomePage() {
        return "admin/home";
    }

    @RequestMapping("admin/top")
    public String toTopPage() {
        return "admin/top";
    }

    @RequestMapping("admin/left")
    public String toLeftPage() {
        return "admin/left";
    }

    @RequestMapping("admin/welcome")
    public String toWelcomePage() {
        return "admin/welcome";
    }

    @RequestMapping("admin/bottom")
    public String toBottomPage() {
        return "admin/bottom";
    }

}
