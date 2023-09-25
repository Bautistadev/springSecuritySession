package com.example.springSecurity.part1.Service;

import com.example.springSecurity.part1.Entity.User;
import com.example.springSecurity.part1.Repository.UserRepository;
import com.example.springSecurity.part1.Repository.UserRepositoryImplements;
import com.example.springSecurity.part1.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public class UserService {


    private UserRepositoryImplements userRepository;

    public UserService(UserRepositoryImplements userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO findById(Long aLong){

        User user = this.userRepository.findById(1L).get();

        UserDTO userDTO = new UserDTO().id(new BigDecimal(user.getId()))
                .userName(user.getUserName())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .password(user.getPassword())
                .dateCreated(user.getDateCreated())
                .dateDeleted(user.getDateDeleted());

        return userDTO;
    }
}
