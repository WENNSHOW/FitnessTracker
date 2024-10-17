package com.example.yarosh.services.goal;

import com.example.yarosh.dto.GoalDTO;
import com.example.yarosh.entity.Goal;
import com.example.yarosh.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;

    @Override
    public GoalDTO postGoal(GoalDTO goalDTO) {
        Goal goal = new Goal();

        goal.setDescription(goalDTO.getDescription());
        goal.setEndDate(goalDTO.getEndDate());
        goal.setStartDate(goalDTO.getStartDate());
        goal.setAchieved(false);

        return goalRepository.save(goal).getGoalDTO();
    }

    @Override
    public List<GoalDTO> getGoals() {
        List<Goal> goals = goalRepository.findAll();

        return goals.stream().map(Goal::getGoalDTO).collect(Collectors.toList());
    }
}
