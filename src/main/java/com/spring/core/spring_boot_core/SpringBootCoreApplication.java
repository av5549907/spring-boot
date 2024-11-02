package com.spring.core.spring_boot_core;

import com.spring.core.spring_boot_core.comp.Father;
import com.spring.core.spring_boot_core.comp.Student;
import com.spring.core.spring_boot_core.controllers.HomeController;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication {


	public static void main(String[] args) throws InterruptedException {

		ConfigurableApplicationContext context =SpringApplication.run(SpringBootCoreApplication.class, args);
//		Student student=context.getBean(Student.class);
//		System.out.println(student);
//		student.study();
		Father father=context.getBean(Father.class);
		Father father1=context.getBean(Father.class);
		Father father2=context.getBean(Father.class);
		father.useStudent();
		System.out.println(father+" "+father1+" "+father2); //By default singleton pattern is implemneted// we will get same Object for it.


		HomeController controller=context.getBean(HomeController.class);
       controller.login();


	}

}
