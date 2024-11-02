package com.spring.core.spring_boot_core.servicesImpl;

import com.spring.core.spring_boot_core.services.LoginService;
import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleLoginServiceImpl implements LoginService {
    @Override
    public void login() throws InterruptedException {
        System.out.println("oracle db is running..........");

    }

    @Override
    public void logout() {

    }
}
