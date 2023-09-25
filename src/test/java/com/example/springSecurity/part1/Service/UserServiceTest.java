package com.example.springSecurity.part1.Service;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import com.example.springSecurity.part1.dto.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepositoryImplements userRepositoryImplements
    ;@InjectMocks
    private UserService service;

    private UserDTO userDTO;

    @BeforeEach
    void setUp() {
        userDTO = new UserDTO();
        userDTO.id(new BigDecimal(1L));
        userDTO.firstName("admin");
        userDTO.userName("admin");
        userDTO.lastName("admin");
        userDTO.password("admin");
        userDTO.dateCreated("2023-09-24 20:16:43.798590");
        userDTO.dateDeleted(null);

    }

    @Test
    void findById() {

    }
}