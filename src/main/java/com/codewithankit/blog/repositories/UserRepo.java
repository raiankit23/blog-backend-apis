package com.codewithankit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithankit.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
