package com.spring.core.spring_boot_core.controllers;

import com.spring.core.spring_boot_core.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {
    @Autowired
    private LoginService loginService;

    public void login() throws InterruptedException {
        loginService.login();
    }

}
