package com.example.yarosh.services.stats;

import com.example.yarosh.dto.StatsDTO;
import com.example.yarosh.repository.ActivityRepository;
import com.example.yarosh.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatsServiceImpl implements StatsService {

    private final GoalRepository goalRepository;
    private final ActivityRepository activityRepository;

    @Override
    public StatsDTO getStats() {
        Long achievedGoals = goalRepository.countAchievedGoals();
        Long notAchievedGoals = goalRepository.countNotAchievedGoals();

        Integer totalSteps = activityRepository.getTotalSteps();
        Double totalDistance = activityRepository.getTotalDistance();
        Integer totalCaloriesBurned = activityRepository.getTotalCaloriesBurned();

        StatsDTO dto = new StatsDTO();

        dto.setAchievedGoals(achievedGoals != null ? achievedGoals : 0L);
        dto.setNotAchievedGoals(notAchievedGoals != null ? notAchievedGoals : 0L);

        dto.setSteps(totalSteps != null ? totalSteps : 0);
        dto.setDistance(totalDistance != null ? totalDistance : 0.0);
        dto.setTotalCaloriesBurned(totalCaloriesBurned != null ? totalCaloriesBurned : 0);

        return dto;
    }


}
