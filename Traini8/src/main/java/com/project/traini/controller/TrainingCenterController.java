package com.project.traini.controller;

import com.project.traini.entity.TrainingCenter;
import com.project.traini.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {

        TrainingCenter savedCenter = service.saveTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return ResponseEntity.ok(centers);
    }
}
