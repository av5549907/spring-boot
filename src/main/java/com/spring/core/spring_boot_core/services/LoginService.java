package com.spring.core.spring_boot_core.services;

import org.springframework.stereotype.Component;

@Component
public interface LoginService {
    public void login() throws InterruptedException;
    public void logout();
}
