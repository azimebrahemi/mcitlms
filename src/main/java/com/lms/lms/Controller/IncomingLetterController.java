package com.lms.lms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.lms.exception.IncomingLetterNotFoudException;
import com.lms.lms.exception.UserNotFoundException;
import com.lms.lms.model.User;
import com.lms.lms.model.incomingLetter;
import com.lms.lms.repository.IncomingLetterRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
public class IncomingLetterController {

    @Autowired
    private IncomingLetterRepository incomingLetterRepository;

    @PostMapping("/incletter")
    incomingLetter newIncLetter(@RequestBody incomingLetter newIncLetter) {
        return incomingLetterRepository.save(newIncLetter);
    }

    @GetMapping("/incletter")
    List<incomingLetter> getAllLetters() {
        return incomingLetterRepository.findAll();
    }

    @GetMapping("/incletter/{id}")
    incomingLetter getLetterbyID(@PathVariable Long id) {
        return incomingLetterRepository.findById(id)
                .orElseThrow(() -> new IncomingLetterNotFoudException(id));
    }

}
