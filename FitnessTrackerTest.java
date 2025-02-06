import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.example.FitnessTracker;
import org.example.Workout;
public class FitnessTrackerTest {

    @Test
    void testLogWorkout() {
        FitnessTracker tracker = new FitnessTracker();
        Workout workout = new Workout("Running", 30, 300, "2025-02-07");

        tracker.logWorkout(workout);
        List<Workout> history = tracker.getWorkoutHistory();

        assertEquals(1, history.size(), "Workout history should have one entry.");
        assertEquals(workout, history.get(0), "Logged workout should match the expected one.");
    }

    @Test
    void testWorkoutHistory() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.logWorkout(new Workout("Running", 30, 300, "2025-02-07"));
        tracker.logWorkout(new Workout("Cycling", 45, 450, "2025-02-08"));

        List<Workout> history = tracker.getWorkoutHistory();

        assertEquals(2, history.size(), "Workout history should contain two workouts.");
        assertEquals("Running", history.get(0).getType(), "First workout should be 'Running'.");
        assertEquals("Cycling", history.get(1).getType(), "Second workout should be 'Cycling'.");
    }

    @Test
    void testGoalTracking() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.setFitnessGoal(700);

        tracker.logWorkout(new Workout("Running", 30, 300, "2025-02-07"));
        tracker.logWorkout(new Workout("Cycling", 45, 450, "2025-02-08"));

        assertTrue(tracker.isGoalMet(), "Fitness goal should be met.");
    }

    @Test
    void testGoalNotMet() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.setFitnessGoal(1000);

        tracker.logWorkout(new Workout("Running", 30, 300, "2025-02-07"));
        tracker.logWorkout(new Workout("Cycling", 45, 450, "2025-02-08"));

        assertFalse(tracker.isGoalMet(), "Fitness goal should not be met.");
    }
}
