package com.example.springSecurity.part1.configuration;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Repository.UserRepository;
import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import com.example.springSecurity.part1.Service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public class AppConfiguration {

    @Bean
    public UserRepositoryImplements getUserRepostory(){
        return new UserRepositoryImplements();
    }

    @Bean
    @Primary
    public UserService getUserService(UserRepositoryImplements userRepository){return new UserService(userRepository);}
}
