package com.vn.devmaster.sevice.depenment.Hello_word;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
public class Hello_word {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Sơn") String name) {
        return String.format("Hello %s!", name);
    }
}
