package com.test;

import com.test.TestSQLServer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private TestService _testService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String welcome() {
        _testService.test();
        return "home";
    }
}
