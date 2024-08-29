package com.telles.workout.application;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Request to create a workout")
public class WorkoutRequest {

    @Schema(description = "Kind of a workout", example = "RUN_TREADMILL")
    private WorkoutKind workoutKind;

    @Schema(description = "Calories number", example = "600")
    private int calories;
}
