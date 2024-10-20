package com.example.yarosh.repository;

import com.example.yarosh.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    @Query("select sum(w.duration) from Workout w")
    Integer getTotalDuration();

    @Query("select sum(w.caloriesBurned) from Workout w")
    Integer getTotalWorkoutCaloriesBurned();
}
