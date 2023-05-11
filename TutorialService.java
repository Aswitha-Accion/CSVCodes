package com.javaguides.service;

import com.javaguides.entity.CSVHelper;
import com.javaguides.entity.Tutorial;
import com.javaguides.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static javax.script.ScriptEngine.FILENAME;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository repository;

    public void save(MultipartFile file){
        try{

            List<Tutorial> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        }catch (Exception e)
        {
            throw new RuntimeException();
        }
    }

    public List<Tutorial> getAllTutorials(){

        return repository.findAll();
    }
}
