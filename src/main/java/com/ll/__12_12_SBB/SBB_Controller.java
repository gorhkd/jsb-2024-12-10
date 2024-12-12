package com.ll.__12_12_SBB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SBB_Controller {

    @GetMapping("/")
    @ResponseBody
    public String mainPage() {
        return "hello";
    }


}
