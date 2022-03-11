package WorkoutApp;

public class FirstWorkoutTracker
{
    private String exercise;
    private int weight;
    private int reps;
    private int sets;

    public FirstWorkoutTracker()
    {
        this("no lift");
    }

    public FirstWorkoutTracker(String exercise)
    {
        this(exercise, 0);
    }

    public FirstWorkoutTracker(String exercise, int sets)
    {
        this(exercise, sets, 0);
    }

    public FirstWorkoutTracker(String exercise, int sets, int reps)
    {
        this(exercise, sets, reps, 0);
    }

    public FirstWorkoutTracker(String exercise, int sets, int reps, int weight)
    {
        this.exercise = exercise;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    public String toString()
    {
        return (getExercise() + ": " + getNumSets() + " sets of " + getNumReps() + " reps done at " + getWeightUsed() + " pounds.");
    }

    public String getExercise()
    {
        return exercise;
    }

    public int getWeightUsed()
    {
        return weight;
    }

    public int getNumReps()
    {
        return reps;
    }

    public int getNumSets()
    {
        return sets;
    }
}
