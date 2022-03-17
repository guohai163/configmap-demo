package org.guohai.configmapdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guohai
 */
@RestController
public class HomeController {

    @Value("${setings.psss}")
    String pass;
    @Value("${setings.min}")
    String min;

    /**
     * 首页
     * @return 返回读取到的值
     */
    @GetMapping("/")
    public String home() {
        return String.format("%s,%s", pass, min);
    }
}
