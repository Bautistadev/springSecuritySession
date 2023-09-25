package com.example.springSecurity.part1;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.springSecurity.part1"})
public class Part1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Part1Application.class, args);

		UserRepositoryImplements u = context.getBean(UserRepositoryImplements.class);

		System.out.println(u.existsById(1L));

	}

}

