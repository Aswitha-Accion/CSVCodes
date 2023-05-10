package com.javaguides.repository;

import com.javaguides.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Integer> {


}
