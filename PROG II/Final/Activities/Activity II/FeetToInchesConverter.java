import java.util.Scanner;

public class FeetToInchesConverter {

    public static int convertToInches(int feet) {
        return feet * 12;

    }
        
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Enter the number of feet: ");
        int feet = scanner.nextInt();

        int inches = convertToInches(feet);
        System.out.println("Inches: " + inches);
        scanner.close();

          }
        }
      }

