package com.example.springSecurity.part1.configuration;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public class AppConfiguration {

    @Bean
    public JpaRepository<User,Long> getJPARepository(){
        return new UserRepositoryImplements();
    }

}
