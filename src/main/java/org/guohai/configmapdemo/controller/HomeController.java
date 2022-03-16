package org.guohai.configmapdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${setings.mysql-psss}")
    String pass;

    @GetMapping("/")
    public String home() {
        return pass;
    }
}
