package com.nhc.book.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/myAccount")
    public String toMyAccountPage(){
        return "user/myAccount";
    }
    @RequestMapping("/register")
    public String toRegisterPage(){
        return "user/register";
    }
    @RequestMapping("doRegister")
    public String toDoResigerPage(){
        return "user/registersuccess";
    }
    @RequestMapping("/modifyuserinfo")
    public String toModifyUserInfoPage(){
        return "user/modifyuserinfo";
    }
}
