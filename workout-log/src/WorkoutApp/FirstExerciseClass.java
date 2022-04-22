
//My First java workout app

package WorkoutApp;

import java.time.*;
import java.time.format.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Files;
//import org.apache.commons.io.FileUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
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
    	workoutList.add("Back Squat (Legs)");
    	workoutList.add("Barbell Rows (Back)");
    	workoutList.add("Bench Press (Chest)");
    	workoutList.add("Bent Over Row (Back)");
    	workoutList.add("Bicep Curls (Biceps)" );
    	workoutList.add("Bulgarian Split Squat (Legs)");
    	workoutList.add("Calf Raises (Calves)");
    	workoutList.add("Chest Flys (Chest)");
    	workoutList.add("Close Grip Bench (Triceps)");
    	workoutList.add("Deadlift (Back)");
    	workoutList.add("Dumbell Bench (Chest)");
    	workoutList.add("Dumbell Kickbacks (Legs)");
    	workoutList.add("Front Squat (Legs)");
    	workoutList.add("Goblet Squat (Legs)");
    	workoutList.add("Good Mornings (Legs)");
    	workoutList.add("Hip Thrusts (Legs)");
    	workoutList.add("Incline Bench (Chest)");
    	workoutList.add("Kettle Bell Swings (Shoulders)");
    	workoutList.add("Lateral Raise (Shoulders)");
    	workoutList.add("Leg Curls (Legs)");
    	workoutList.add("Leg Extensions (Legs)");
    	workoutList.add("Lunges (Legs)");
    	workoutList.add("Military Press (Shoulders)");
    	workoutList.add("Narrow Squats (Legs)");
    	workoutList.add("Pull Downs (Back)");
    	workoutList.add("Push Press (Shoulders)");
    	workoutList.add("Romanian Deadlifts (Legs)");
    	workoutList.add("Seated Row (Back)");
    	workoutList.add("Shoulder Press (Shoulders)");
    	workoutList.add("Shrugs (Shoulders)");
    	workoutList.add("Skull Crushers (Triceps)");
    	workoutList.add("Tricep Pushdown (Triceps)");
    	workoutList.add("Upright Row (Shoulders)");
    	workoutList.add("Wide Grip Bench (Chest)");
    	workoutList.add("Wide Grip Row (Back)");
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
        System.out.println("Choose an exercise from the list below or press 36 to end your workout.");
        showWorkoutList();
        int exerciseChoice = keyboard.nextInt();
        String exerciseDone = workoutList.get(exerciseChoice-1);
        switch(exerciseChoice)
        {
            case 1:
                System.out.println(exerciseDone+ ". Dont forget your belt!");
                return exerciseDone ;
            case 2:
                System.out.println(exerciseDone+ ". Keep your back straight!");
                return exerciseDone;
            case 3:
                System.out.println(exerciseDone+ ". Keep your butt on the bench!");
                return exerciseDone;
            case 4:
                System.out.println(exerciseDone+ ". Keep your back straight!");
                return exerciseDone;
            case 5:
                System.out.println(exerciseDone+ ". Don't Swing!");
                return exerciseDone;
            case 6:
                System.out.println(exerciseDone+ ". Make sure to keep your balance!");
                return exerciseDone;
            case 7:
                System.out.println(exerciseDone+ ". Feel the burn!");
                return exerciseDone;
            case 8:
                System.out.println(exerciseDone+ ". squeeze your chest at the end on each rep!");
                return exerciseDone;
            case 9:
                System.out.println(exerciseDone+ ". Keep your elbows tucked in!");
                return exerciseDone;
            case 10:
                System.out.println(exerciseDone+ ". Keep your back straight and don't forget your belt!");
                return exerciseDone;
            case 11:
                System.out.println(exerciseDone+ ". Make sure to press at a slight angle!");
                return exerciseDone;
            case 12:
                System.out.println(exerciseDone+ ". Keep the form good!");
                return exerciseDone;
            case 13:
                System.out.println(exerciseDone+ ". Make sure the bar is set comforatably!");
                return exerciseDone;
            case 14:
                System.out.println(exerciseDone+ ". Keep the dumbell centered!");
                return exerciseDone;
            case 15:
                System.out.println(exerciseDone+ ". Keep the form good!");
                return exerciseDone;
            case 16:
                System.out.println(exerciseDone+ ". Thrust hard and keep your back straight!");
                return exerciseDone;
            case 17:
                System.out.println(exerciseDone+ ". Focus on squeezing your chest!");
                return exerciseDone;
            case 18:
                System.out.println(exerciseDone+ ". Don't swing too hard!");
                return exerciseDone;
            case 19:
                System.out.println(exerciseDone+ ". Focus on your shoulders more than your traps!");
                return exerciseDone;
            case 20:
                System.out.println(exerciseDone+ ". Squeeze your glutes!");
                return exerciseDone;
            case 21:
                System.out.println(exerciseDone+ ". Don't swing your legs!");
                return exerciseDone;
            case 22:
                System.out.println(exerciseDone+ ". Focus on getting to 90 degrees!");
                return exerciseDone;
            case 23:
                System.out.println(exerciseDone+ ". Keep your back straight!");
                return exerciseDone;
            case 24:
                System.out.println(exerciseDone+ ". Keep you feet close together!");
                return exerciseDone;
            case 25:
                System.out.println(exerciseDone+ ". Focus on form!");
                return exerciseDone;
            case 26:
                System.out.println(exerciseDone+ ". Keep your back straight!");
                return exerciseDone;
            case 27:
                System.out.println(exerciseDone+ ". Hold each rep for a couple seconds!");
                return exerciseDone;
            case 28:
                System.out.println(exerciseDone+ ". Keep your elbows tucked!");
                return exerciseDone;
            case 29:
                System.out.println(exerciseDone+ ". Don't pring the weight lower then your chin!");
                return exerciseDone;
            case 30:
                System.out.println(exerciseDone+ ". Focus on your traps!");
                return exerciseDone;
            case 31:
                System.out.println(exerciseDone+ ". Keep your elbows tucked!");
                return exerciseDone;
            case 32:
                System.out.println(exerciseDone+ ". Get your elbows to 90 degrees!");
                return exerciseDone;
            case 33:
                System.out.println(exerciseDone+ ". Keep your grip fairly narrow!");
                return exerciseDone;
            case 34:
                System.out.println(exerciseDone+ ". Keep your butt on the seat!");
                return exerciseDone;
            case 35:
                System.out.println(exerciseDone+ ". Keep your back postion proper!");
                return exerciseDone;
            case 36:
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

    public void printResults() throws FileNotFoundException
    {
        System.out.println(todaysDate + "\n");
        for(FirstWorkoutTracker stat : tracker)
        {
            System.out.println(stat);
        }
        System.out.println("\nTotal weight lifted today: " + totalWeightLifted + " pounds!");
        
        PrintWriter writer = new PrintWriter("WorkoutLog");
        writer.print(todaysDate + "\n");
        System.out.println(todaysDate + "\n");
        for(FirstWorkoutTracker stat : tracker)
        {
            writer.println(stat);
        }
     writer.print("\nTotal weight lifted today: " + totalWeightLifted + " pounds!");
        
         writer.close();
    }



}
