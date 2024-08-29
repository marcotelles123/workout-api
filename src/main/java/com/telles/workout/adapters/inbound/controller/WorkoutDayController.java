package com.telles.workout.adapters.inbound.controller;

import com.telles.workout.application.WorkoutRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workoutday")
public class WorkoutDayController {
    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.status(HttpStatus.OK).body("WEEE ARREEEE LIVEEEEEE!!!");
    }

    @PostMapping
    public ResponseEntity<Boolean> registerWorkout(@RequestBody WorkoutRequest workoutRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
