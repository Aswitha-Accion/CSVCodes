package com.javaguides.controller;

import com.javaguides.entity.Tutorial;
import com.javaguides.service.TutorialService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TutorialController {

    @Autowired
    private TutorialService tutorialService;

    //uploading file
    @PostMapping(value = "/upload", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> uploadData(@RequestParam("file") MultipartFile file) {
        try {
            String message = "upload file successfully";
            return new ResponseEntity<String>(message, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    //Fetching the data from file
    @GetMapping("/tutorials")
    public ResponseEntity<List> getAllTutorials() {
        List tutorials = (List) tutorialService.getAllTutorials();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

