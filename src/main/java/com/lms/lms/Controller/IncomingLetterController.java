package com.lms.lms.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.lms.lms.repository.IncomingLetterRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
public class IncomingLetterController {
    private IncomingLetterRepository incomingLetterRepository;
}
