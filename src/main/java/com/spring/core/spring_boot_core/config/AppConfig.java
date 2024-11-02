package com.spring.core.spring_boot_core.config;

import com.spring.core.spring_boot_core.comp.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /// creating second Bean

    @Bean("student1")
    public Student student1(){
        Student student=new Student();
        student.setName("student1");
        return student;
    }

    @Bean("student2")
    public  Student student2(){
        Student student=new Student();
        student.setName("student2");
        return student;
    }
}
