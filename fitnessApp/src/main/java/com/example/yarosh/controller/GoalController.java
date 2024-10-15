package com.example.yarosh.controller;

import com.example.yarosh.dto.GoalDTO;
import com.example.yarosh.services.goal.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GoalController {
    private final GoalService goalService;

    @PostMapping("/goal")
    public ResponseEntity<?> postGoal(@RequestBody GoalDTO dto) {

        GoalDTO createGoal = goalService.postGoal(dto);

        if (createGoal != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createGoal);
        }
        else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong!!!");
        }
    }
}