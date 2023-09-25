package com.example.springSecurity.part1;

import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import com.example.springSecurity.part1.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositoryImplements userRepository;

    public UserDTO findById(Long aLong){


        return null;
    }
}
