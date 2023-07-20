package com.example.csvReadUpload.Repository;

import com.example.csvReadUpload.Models.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository <Tutorial, Integer> {
}
