package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.Controllers.UserController;
import com.example.UserDao.UserDao;
import com.example.UserDaoImpl.UserDaoImpl;
import com.example.helloworld.HelloWorld;
import com.example.model.Users;  


@EnableTransactionManagement
@ComponentScan(basePackageClasses = {HelloWorld.class, UserController.class, Users.class, UserDaoImpl.class, UserDao.class})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoApplication {
 
	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(DemoApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        System.out.println();    
        
	}

}
 