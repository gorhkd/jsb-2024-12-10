package com.my.SBB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public void home() {
        System.out.println("Home page requested");
    }

    @GetMapping("/about")
    public void about() {
        System.out.println("adout");
    }


}
