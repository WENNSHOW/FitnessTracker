package com.example.yarosh.services.stats;

import com.example.yarosh.dto.StatsDTO;
import com.example.yarosh.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StatsServiceImpl implements StatsService {

    private final GoalRepository goalRepository;

    @Override
    public StatsDTO getStats() {
        Long achievedGoals = goalRepository.countAchievedGoals();
        Long notAchievedGoals = goalRepository.countNotAchievedGoals();

        StatsDTO dto = new StatsDTO();
        dto.setAchievedGoals(achievedGoals != null ? achievedGoals : 0L);
        dto.setNotAchievedGoals(notAchievedGoals != null ? notAchievedGoals : 0L);

        return dto;
    }
}
