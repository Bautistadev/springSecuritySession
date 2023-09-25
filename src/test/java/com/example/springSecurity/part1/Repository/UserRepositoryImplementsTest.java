package com.example.springSecurity.part1.Repository;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Service.UserService;
import com.example.springSecurity.part1.dto.UserDTO;
import org.h2.command.dml.MergeUsing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserRepositoryImplementsTest {


    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private  UserRepositoryImplements userRepositoryImplements;

    private User user;

    @BeforeEach
    void setUp(){
        //INICIAMOS MOCKITO
        MockitoAnnotations.initMocks(this);
        user = new User.Builder()
                .setId(1L)
                .setFirstName("admin")
                .setUserName("admin")
                .setLastName("admin")
                .setPassword("admin")
                .setDateCreated("2023-09-24 20:16:43.798590")
                .setDateDeleted(null)
                .build();

    }

    @Test
    void findAll() {
        when(this.userRepository.findAll()).thenReturn(Arrays.asList(user));
    }

    @Test
    void existsById() {
        when(this.userRepository.existsById(1L)).thenReturn(true);
    }

    @Test
    void save() {
       when(this.userRepositoryImplements.save(user)).thenReturn(user);
    }
}