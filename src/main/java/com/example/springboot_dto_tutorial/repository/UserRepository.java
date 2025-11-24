package com.example.springboot_dto_tutorial.repository;

import com.example.springboot_dto_tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//type of primary key
public interface UserRepository extends JpaRepository<User, Long> {
}
