package org.example;

public class Workout {
    private String type;
    private int duration;
    private int caloriesBurned;
    private String date; // YYYY-MM-DD format

    // Constructor
    public Workout(String type, int duration, int caloriesBurned, String date) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }

    public void setCaloriesBurned(int caloriesBurned) {
        if (caloriesBurned >= 0) {
            this.caloriesBurned = caloriesBurned;
        }
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "type='" + type + '\'' +
                ", duration=" + duration + " minutes" +
                ", caloriesBurned=" + caloriesBurned +
                ", date='" + date + '\'' +
                '}';
    }
}
