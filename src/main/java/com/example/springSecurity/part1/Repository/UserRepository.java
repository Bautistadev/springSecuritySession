package com.example.springSecurity.part1.Repository;

import com.example.springSecurity.part1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
