import java.util.Scanner;
public class SOLTERAL_ACTIVITY_IV {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int factorial= 1;

        for(int i=1; i<=number;i++) {
            factorail=factorial * i;
        }

        System.out.println("Factorail:"+ factorial);
    }
}
