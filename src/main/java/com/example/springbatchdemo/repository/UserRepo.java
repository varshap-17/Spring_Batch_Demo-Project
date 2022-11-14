package com.example.springbatchdemo.repository;

import com.example.springbatchdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
