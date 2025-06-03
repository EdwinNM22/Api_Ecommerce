package scrum_master.com.e_commerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {


    @RequestMapping("")
    public String vistahome(){
        return "home/index";
    }



}
