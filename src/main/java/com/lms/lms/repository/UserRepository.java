package com.lms.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.lms.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
