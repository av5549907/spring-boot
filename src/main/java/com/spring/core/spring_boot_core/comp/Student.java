package com.spring.core.spring_boot_core.comp;

import org.springframework.stereotype.Component;

@Component("student45")
public class Student {

    private String name="default";
    public  void study(){
        System.out.println("Student is studying "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
