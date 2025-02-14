package com.project.traini.service;

import com.project.traini.entity.TrainingCenter;
import java.util.List;

public interface TrainingCenterService {
    TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> getAllTrainingCenters();
}
