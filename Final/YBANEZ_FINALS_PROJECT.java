import java.util.Random;
import java.util.Scanner;

public class YBANEZ_FINALS_PROJECT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String studentID, name, course, section, academicStanding;
        int yearLevel, age, dogAge;
        double gpa;

        // Get student information
        System.out.print("Enter your Student ID: ");
        studentID = scanner.nextLine();

        System.out.print("Enter your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter your Course: ");
        course = scanner.nextLine();

        System.out.print("Enter your Section: ");
        section = scanner.nextLine();

        System.out.print("Enter your Year Level: ");
        yearLevel = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        gpa = scanner.nextDouble();

        // Determine academic standing
        if (gpa <= 1.5) {
            academicStanding = "Magna Cum Laude";
        } else if (gpa <= 2.0) {
            academicStanding = "Cum Laude";
        } else if (gpa <= 2.75) {
            academicStanding = "With Honors";
        } else if (gpa <=5.0) {
            academicStanding = "My Apologies";
        } else {
            academicStanding = "Regular";
        }

        // Calculate age in dog years because why not
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();
        dogAge = age * 7;

        // Silly message based on age
        String ageMessage;
        int ageGroup;

        if (age < 0) {
            ageGroup = 0; // Invalid age
        }  else if (age < 13) {
            ageGroup = 1; // Child
        }  else if (age < 18) {
            ageGroup = 2; // Teenager
        }  else if (age < 25) {
            ageGroup = 3; // Young Adult
        }  else {
            ageGroup = 4; // Wise Old Sage
       }

    switch (ageGroup) {
        case 0:
            ageMessage = "How";
            break;
        case 1:
            ageMessage = "You're still young, little sproutling! Keep learning and growing.";
            break;
        case 2:
            ageMessage = "You're on your way to being a young adult, ready to conquer the world!";
            break;
        case 3:
            ageMessage = "Good luck with that!";
            break;
        case 4:
            ageMessage = "You're a wise old sage, full of knowledge and experience.";
            break;
        default:
            ageMessage = "Unexpected age group.";
            break;
    }
        // Display student information
        System.out.println("\nStudent Information");
        System.out.println("----------------");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("Academic Standing: " + academicStanding);
        System.out.println(dogAge);
        System.out.println(ageMessage);

        // Remember, hard work pays off! (Random annoying message for funsies~)
        int counter = 0;
        while (counter < 3) {
            System.out.println("Remember, hard work pays off!");
            counter++;
        }

        // a silly countdown
        System.out.println("Let's count down to the end of the semester!");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("WAIT! IT'S NOT OVER.");
        System.out.println("1. ???");
        System.out.println("2. ???!!!");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose Option 1. That's it. Hehe.");
                break;
            case 2:
                System.out.println("You chose Option 2.");
                 Random random = new Random();
        int correctAnswers = 0;
        int totalQuestions = 5;

        System.out.println("Welcome to the Math Quiz!");

        for (int i = 1; i <= totalQuestions; i++) {
            int num1 = random.nextInt(10) + 1; // Generate random numbers between 1 and 10
            int num2 = random.nextInt(10) + 1; 
            int operatorChoice = random.nextInt(4); // 0: +, 1: -, 2: *, 3: /
            int correctAnswer;

            switch (operatorChoice) {
                case 0: 
                    System.out.print(num1 + " + " + num2 + " = ");
                    correctAnswer = num1 + num2;
                    break;
                case 1: 
                    System.out.print(num1 + " - " + num2 + " = ");
                    correctAnswer = num1 - num2;
                    break;
                case 2: 
                    System.out.print(num1 + " * " + num2 + " = ");
                    correctAnswer = num1 * num2;
                    break;
                case 3: 
                    System.out.print(num1 + " / " + num2 + " = "); 
                    correctAnswer = num1 / num2; // Integer division
                    break;
                default: 
                    System.out.println("Error: Invalid operator.");
                    continue; // Skip to the next question
            }

            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }

            System.out.println(); 
        }

            System.out.println("You got " + correctAnswers + " out of " + totalQuestions + " correct.");
            System.out.println("Your score: " + ((double) correctAnswers / totalQuestions) * 100 + "%");

            case 3:
                System.out.println("Farewell...Tell my family...goodbye...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }
}