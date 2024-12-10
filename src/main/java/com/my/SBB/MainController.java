package com.my.SBB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "1111111111111";
    }


}
