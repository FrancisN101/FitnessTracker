package org.example;

public class Main {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();

        // Sample workouts
        tracker.logWorkout(new Workout("Running", 30, 300, "2025-02-07"));
        tracker.logWorkout(new Workout("Cycling", 45, 450, "2025-02-08"));

        // Set a fitness goal
        tracker.setFitnessGoal(700);

        // Display progress
        tracker.showProgress();

        // Check if goal is met
        System.out.println("Goal Met: " + tracker.isGoalMet());
    }
}
