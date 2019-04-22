package pl.chomik.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloControler {

    @GetMapping("/hello")
    public String hello() {
        System.out.println(" hello");
        return "Hello World";
    }
}
