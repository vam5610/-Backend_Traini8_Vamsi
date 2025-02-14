package com.project.traini.service;

import com.project.traini.entity.TrainingCenter;
import com.project.traini.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    @Override
    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        return repository.save(trainingCenter);
    }

    @Override
    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
