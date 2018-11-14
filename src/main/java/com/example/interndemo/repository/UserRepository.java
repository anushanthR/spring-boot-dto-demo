package com.example.interndemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.interndemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
