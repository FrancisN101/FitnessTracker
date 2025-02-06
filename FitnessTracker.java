package org.example;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
    private List<Workout> workouts;
    private int fitnessGoal; // Total calories to burn per week

    // Constructor
    public FitnessTracker() {
        this.workouts = new ArrayList<>();
        this.fitnessGoal = 0; //(no goal set)
    }

    // Add a workout
    public void logWorkout(Workout workout) {
        if (workout != null) {
            workouts.add(workout);
            System.out.println("Workout logged: " + workout);
        }
    }

    // Get all workouts
    public List<Workout> getWorkoutHistory() {
        return new ArrayList<>(workouts);
    }

    // Set a fitness goal
    public void setFitnessGoal(int goal) {
        if (goal > 0) {
            this.fitnessGoal = goal;
            System.out.println("Fitness goal set to " + goal + " calories.");
        } else {
            System.out.println("Invalid goal. Must be greater than zero.");
        }
    }

    // Check if goal is met
    public boolean isGoalMet() {
        int totalCaloriesBurned = workouts.stream().mapToInt(Workout::getCaloriesBurned).sum();
        return totalCaloriesBurned >= fitnessGoal;
    }

    // Display total progress
    public void showProgress() {
        int totalCaloriesBurned = workouts.stream().mapToInt(Workout::getCaloriesBurned).sum();
        System.out.println("Total Calories Burned: " + totalCaloriesBurned + "/" + fitnessGoal);
        System.out.println("Goal Met: " + isGoalMet());
    }
}

