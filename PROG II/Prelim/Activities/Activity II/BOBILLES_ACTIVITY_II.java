import java.util.Scanner;

public class BOBILLES_ACTIVITY_II {

        public static void main(String[] args) {
            
            double[] scores = new double[10];;
            Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter 10 scores: ");

            for(int i = 0; i < scores.length; i++){
                System.out.print("Score" + (i + 1) + ":");
                scores[i] = scanner.nextDouble ();

            }

            double sum = 0;
                for(double score : scores){
                    sum += score;
                }

                double average = sum / scores.length;

            System.out.printf("The Average of the Entered scores is: %.2f%n", average);

            scanner.close();
        } 

    }
