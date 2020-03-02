package com.sdxb.ajaxtext.controller;

import com.sdxb.ajaxtext.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class indexController {

    @RequestMapping("/test")
    public String index(){
        return "index";
    }

    @RequestMapping("/log")
    public String login(){
        return "login";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String index2(HttpServletResponse response){
        return "hello world";
    }
    @PostMapping("/test3")
    @ResponseBody
    public Result index3(HttpServletRequest request,HttpServletResponse response){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        Result result=new Result();
        if (username.equals("sdxb")&&password.equals("123456")){
            result.setRes(true);
            return result;
        }
        else {
            result.setRes(false);
            return result;
        }
    }

}
