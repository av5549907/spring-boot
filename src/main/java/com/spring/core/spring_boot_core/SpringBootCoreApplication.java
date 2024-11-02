package com.spring.core.spring_boot_core;

import com.spring.core.spring_boot_core.comp.Father;
import com.spring.core.spring_boot_core.comp.Student;
import com.spring.core.spring_boot_core.controllers.HomeController;
import com.spring.core.spring_boot_core.demo.Car;
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
		System.out.println(father+" "+father1+" "+father2); //By default singleton pattern is implemented// we will get same Object for it.

		/**
		 *
		 * Demonstration of prototype bean scope
		 */
		/// we have provided bean scope prototype for Car Component/Bean So it will give different object each time.
		Car car1=context.getBean(Car.class);
		Car car2=context.getBean(Car.class);
		System.out.println(car1+" "+car2); //

		HomeController controller=context.getBean(HomeController.class);
       controller.login();


	}

}
