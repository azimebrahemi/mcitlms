package com.lms.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.lms.model.incomingLetter;

public interface IncomingLetterRepository extends JpaRepository<incomingLetter, Long> {

}
