
//My First java workout app

package WorkoutApp;

import java.time.*;
import java.time.format.*;
import java.util.*;
import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import org.apache.commons.io.FileUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FirstExerciseClass
{

// Creates file object and sets pointer
  //  File filePath = new File("C:\\someFilePath\\Workout Log.txt");

// Gets current day/time information
    private LocalDate date = LocalDate.now();   
// Set format to month/day/year     
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
    private String todaysDate = date.format(formatter);

// Declare all variables to be used
    private String exercise;
    private Scanner keyboard = new Scanner(System.in);
    private int sets;
    private int reps;
    private int weight;
    private boolean isFirstExercise;
    private List<String> workoutList = new ArrayList<>();
    private List<String> workoutLog = new ArrayList<>();
    private int totalWeightLifted;
    private List<FirstWorkoutTracker> tracker = new ArrayList<>();


// Adds a list of standard exercises to workoutList
    public void createListOfWorkouts()
    {
        workoutList.add("Squats");
        workoutList.add("Bench Press");
        workoutList.add("Overhead Press");
        workoutList.add("Pull ups");
        workoutList.add("Front Squats");
        workoutList.add("Curls");
        workoutList.add("Shoulder Press");
        workoutList.add("Tricep Extensions");
        workoutList.add("Kettle Bell Swings");
        workoutList.add("Thrusters");
        workoutList.add("To Skip (input 0 for all questions)");
    }

// returns boolean of true if user is planning on doing another exercise otherwise returns false.
    public boolean isStillLifting()
    {
        boolean continueLifting = false;
        System.out.println("Are you done lifting for the day? (y/n)");  
        char result = keyboard.next().charAt(0);
        return continueLifting = (result=='y' || result == 'Y') ? false : true;
    }

// returns boolean of true if user is planning on lifting "today" otherwise returns false
    public boolean isWorkingOut()
    {
        boolean workingOut = false;
        System.out.println("Welcome! Are you working out today? (y/n)");
        char result = keyboard.next().charAt(0);
        return workingOut = (result=='y' || result == 'Y') ? true : false;
    }

//called to display all workouts that are contained in the workoutList
    public void showWorkoutList()
    {
        int i=1;
        for(String workout : workoutList)
        {
            System.out.println(i++ + ". " + workout);
        }
        //System.out.println("11. To Return");
    }


//Gives user a list of exercises to choose from
    public String whatExercise()
    {
        System.out.println("Choose an exercise from the list below or press 11 to end your workout.");
        showWorkoutList();
        int exerciseChoice = keyboard.nextInt();
        String exerciseDone = workoutList.get(exerciseChoice-1);
        switch(exerciseChoice)
        {
            case 1:
                System.out.println(exerciseDone);
                return exerciseDone ;
            case 2:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 3:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 4:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 5:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 6:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 7:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 8:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 9:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 10:
                System.out.println(exerciseDone);
                return exerciseDone;
            case 11:
            	System.out.println("We'll start again tomorrow!");
            	return "";
                
            default:
                System.out.println("What was that now?");
                return "";
        }
    }



    public int numSets()
    {
        System.out.println("How many sets?");
        int setsDone = keyboard.nextInt();
        return setsDone;
    }

    public int numReps()
    {
        System.out.println("How many reps?");
        int repsDone = keyboard.nextInt();
        return repsDone;
    }

    public int weightUsed()
    {
        int weightLifted = 0;
        System.out.println("At what weight?");
        try
        {
            weightLifted = keyboard.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Needs to be a number");
            keyboard.next();
            weightUsed();
        }
        return weightLifted;
    }

    public void workout()
    {
        createListOfWorkouts();
        if(isWorkingOut())
        {
            do
            {
                exercise = whatExercise();
                sets = numSets();   
                reps = numReps();
                weight = weightUsed();
                totalWeightLifted += weight;
                tracker.add(new FirstWorkoutTracker(exercise, sets, reps, weight));
                //System.out.println(tracker.get(0));
            }while(isStillLifting());
        }
        else
        {
            System.out.println("Okay maybe tomorrow.");
        }
    }

    public void printResults()
    {
        System.out.println(todaysDate + "\n");
        for(FirstWorkoutTracker stat : tracker)
        {
            System.out.println(stat);
        }
        System.out.println("\nTotal weight lifted today: " + totalWeightLifted + " pounds!");
    }



}