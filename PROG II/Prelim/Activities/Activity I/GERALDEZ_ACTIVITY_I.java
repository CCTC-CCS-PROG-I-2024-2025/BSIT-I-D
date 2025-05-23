import java.util.Scanner;

public class GERALDEZ_ACTIVITY_I { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        // Input: Prompt the user to enter 5 names
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Loop to ensure valid input for index
        while (true) {
            System.out.print("Enter a number between 1 and 5 to display a name: ");
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                if (index >= 1 && index <= 5) {
                    System.out.println("The name at position " + index + " is: " + names[index - 1]);
                    break; // Exit the loop after displaying the name
                } else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next(); // Consume the invalid input
            }
        }

        scanner.close(); // Close the scanner
    }
}