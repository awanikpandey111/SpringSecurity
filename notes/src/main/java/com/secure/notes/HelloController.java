package com.secure.notes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path="/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
    
    @GetMapping("/contact")
    public String sayContact(){
        return "contact us";
    }
    @GetMapping("/public/access")
    public String sayPublic(){
        return "Public request";
    }
    @GetMapping("/admin/access")
    public String sayAdmin(){
        return "Admin access";
    }
}
