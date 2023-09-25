package com.example.springSecurity.part1;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import com.example.springSecurity.part1.Service.UserService;
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

		User user = new User.Builder()
				.setId(1L)
				.setFirstName("admin")
				.setUserName("admin")
				.setLastName("admin")
				.setPassword("admin")
				.setDateCreated("2023-09-24 20:16:43.798590")
				.setDateDeleted(null)
				.build();

		System.out.println(user);
		System.out.println(u.findById(1L).get());

	}

}

