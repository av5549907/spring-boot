package com.spring.core.spring_boot_core.comp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father {
    private Student student;

    public Father(@Qualifier("student4") Student student) {
        this.student = student;
    }

    public  void useStudent(){
        System.out.println("Father is using student");
        student.study();
    }
}
