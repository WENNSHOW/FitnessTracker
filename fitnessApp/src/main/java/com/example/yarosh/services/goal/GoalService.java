package com.example.yarosh.services.goal;

import com.example.yarosh.dto.GoalDTO;

import java.util.List;

public interface GoalService {
    GoalDTO postGoal(GoalDTO goalDTO);
    List<GoalDTO> getGoals();
    GoalDTO updateStatus(Long id);
}
