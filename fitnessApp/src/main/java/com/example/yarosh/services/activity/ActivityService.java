package com.example.yarosh.services.activity;

import com.example.yarosh.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);

    List<ActivityDTO> getActivities();
}
