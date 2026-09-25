import java.util.Scanner;

public class caloriescalculator{
    public static void main(String[] args){

//declare the scanner class to allow user input
    try(Scanner scanner = new Scanner(System.in)){

//variables for calculations
        float weight = 0; 
        float height = 0; 
        int age = 0; 
        float result = 0;
//variable to determine unit of measurement
        boolean imperial = false;
        boolean metric = false;
//variable to determine sex
        boolean male = false;
        boolean female = false;
//variables for checking input
        boolean isValidInput = false;
        boolean isSexValidInput = false;
        boolean isWeightValueInput = false;
        boolean isHeightValueInput = false;
        boolean isAgeValueInput = false;

//Welcomes the user.
//Prompts them to answer if they use the imperial or metric unit system of measuring
        System.out.println("Welcome to the Calories Calculator. \n Do you use imperial or metric units? \nPlease input:'imperial' or 'metric'");

//Checks if their input is valid for answering previous prompt
//If the input is valid (yes or no), end loop.
//If the input is not valid, loop them back for new input
        while (!isValidInput){

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("imperial") || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("im") || input.equalsIgnoreCase("imp")
            || input.equalsIgnoreCase("impe") || input.equalsIgnoreCase("imper") || input.equalsIgnoreCase("imperia"))
            {
            isValidInput = true;
            imperial = true;
            }
            else if (input.equalsIgnoreCase("metric") || input.equalsIgnoreCase("m") || input.equalsIgnoreCase("me") || input.equalsIgnoreCase("met") || input.equalsIgnoreCase("metr")
             || input.equalsIgnoreCase("metri") || input.equalsIgnoreCase("metri"))
            {
            isValidInput = true;
            metric = true;
            } 
            else {
                System.out.println("Please input either: 'imperial' or 'metric'");
            }
        }

    //Check if they answered the measurement unit question
    //This loop is for if they answered imperial
        if (imperial && isValidInput) {
            //askes for sex: string loop
            System.out.println("What is your biological sex? \n Answer 'male' or 'female'.");
            
            while (!isSexValidInput){
            String sexinput = scanner.nextLine();
                if (sexinput.equalsIgnoreCase("male") || sexinput.equalsIgnoreCase("m"))
            {
            isSexValidInput = true;
            male = true;
            }
            else if (sexinput.equalsIgnoreCase("female") || sexinput.equalsIgnoreCase("f"))
            {
            isSexValidInput = true;
            female = true;
            } 
            else {
                System.out.println("What is your biological sex? \n Please input 'male' or 'female'.");
            } 
            }
            //sex string loop ends
            //numeric values starts
        }

//Checks if user weight input is a actual integer, if not then put back into loop
            if (isSexValidInput && isValidInput) {
            System.out.print("What is your weight?\nPlease input number of lbs:");
            
            while (!isWeightValueInput){
            if (scanner.hasNextFloat()){
                float weightinput = scanner.nextFloat();
                weight = weightinput;
                isWeightValueInput = true;
            } 
            else {
                System.out.print("What is your weight?\nPlease input number of lbs:");
                scanner.next();
            }
        }
    }
        

//work in progress
            if (isSexValidInput && isWeightValueInput) {
            System.out.print("What is your height?\nPlease input number of inches:");
            
            while (!isHeightValueInput){
            if (scanner.hasNextFloat()){
                float heightinput = scanner.nextFloat();
                height = heightinput;
                isHeightValueInput = true;
            } 
            else {
                System.out.print("What is your height?\nPlease input number of inches: ");
                scanner.next();
            }
        }
    }
            if (isSexValidInput && isWeightValueInput) {
            System.out.println("What is your age?\\nPlease input number of years:");
            
            while (!isAgeValueInput){
            if (scanner.hasNextFloat()){
                float ageinput = scanner.nextFloat();
                height = ageinput;
                isAgeValueInput = true;
            } 
            else {
                System.out.print("What is your age?\nPlease input number of years: ");
                scanner.next();
            }
        }
    }

//Checks if they answered the measurement unit question
//This loop is for if they answered metric
        if (metric && isValidInput) {
            System.out.println("What is your biological sex? \n Answer 'male' or 'female'.");
            
            //askes for sex: string loop
            while (!isSexValidInput){
            String sexinput = scanner.nextLine();
                if (sexinput.equalsIgnoreCase("male") || sexinput.equalsIgnoreCase("m"))
            {
            isSexValidInput = true;
            male = true;
            }
            else if (sexinput.equalsIgnoreCase("female") || sexinput.equalsIgnoreCase("f"))
            {
            isSexValidInput = true;
            female = true;
            } 
            else {
                System.out.println("What is your biological sex? \n Please Answer 'male' or 'female'.");
            } 
            }
            //sex string loop ends
            //numeric values starts
            System.out.println("What is your weight in kgs?");
            weight = scanner.nextInt();
            System.out.println("What is your height in cm?");
            height = scanner.nextInt();
            System.out.println("What is your age in years?");
            age = scanner.nextInt();
        }

        if (male && imperial){
            result = (int) (((4.536*weight)+(15.875*height)-(5*age))+5);
        }
        if (female && imperial){
            result = (int) (((4.536*weight)+(15.875*height)-(5*age))-165);
        }


        if (male && metric){
            result = (int) (((4.536*weight)+(15.875*height)-(5*age))+5);
        }

//For personal use. Checking boolean and variable value stored
        System.out.println("status of imperial:"+ imperial);
        System.out.println("status of metric:"+ metric);
        System.out.println("status of valid input:"+ isValidInput);
        System.out.println("Male Sex:"+ male);
        System.out.println("Female Sex:"+ female);
    }
 }   
}