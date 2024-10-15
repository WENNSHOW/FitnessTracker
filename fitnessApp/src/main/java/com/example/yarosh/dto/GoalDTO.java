package com.example.yarosh.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GoalDTO {

    private int id;

    private String description;

    private Date startDate;

    private Date endDate;

    private boolean achieved;

    public GoalDTO getGoalDTO() {
        GoalDTO goalDTO = new GoalDTO();

        goalDTO.setId(id);
        goalDTO.setDescription(description);
        goalDTO.setStartDate(startDate);
        goalDTO.setEndDate(endDate);
        goalDTO.setAchieved(achieved);

        return goalDTO;
    }
}
