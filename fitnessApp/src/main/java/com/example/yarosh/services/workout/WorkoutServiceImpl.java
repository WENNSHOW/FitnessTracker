package com.example.yarosh.services.workout;

import com.example.yarosh.dto.WorkoutDTO;
import com.example.yarosh.entity.Workout;
import com.example.yarosh.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkoutServiceImpl implements WorkoutService {

    private final WorkoutRepository workoutRepository;

    @Override
    public WorkoutDTO postWorkout(WorkoutDTO workoutDTO) {
        Workout workout = new Workout();

        workout.setDate(workoutDTO.getDate());
        workout.setType(workoutDTO.getType());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurned(workoutDTO.getCaloriesBurned());

        return workoutRepository.save(workout).getWorkoutDTO();
    }

    @Override
    public List<WorkoutDTO> getWorkouts(){
        List<Workout> workouts = workoutRepository.findAll();

        return workouts.stream().map(Workout::getWorkoutDTO).collect(Collectors.toList());
    }


}
