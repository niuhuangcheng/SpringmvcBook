package com.nhc.book.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/orderlist")
    public String toMyAccountPage(){
        return "orders/orderlist";
    }
}
