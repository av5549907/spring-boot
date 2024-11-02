package com.spring.core.spring_boot_core.servicesImpl;

import com.spring.core.spring_boot_core.services.LoginService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LoginServiceImpl implements LoginService {
    @Override
    public void login() throws InterruptedException {
        System.out.println("logging user mysql database");
        System.out.println("wait.......");
        Thread.sleep(1000);
        System.out.println("working ...");
        Thread.sleep(1000);
    }

    @Override
    public void logout() {

    }
}
