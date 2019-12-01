package it.cn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class add {
    @RequestMapping("e")
    public String fun(){
        System.out.println("awe");
        return "ok";
    }
}
