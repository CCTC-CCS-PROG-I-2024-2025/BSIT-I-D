import java.util.Scanner;
public class Colorcategorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a color (red,green,black)");
        String color = scanner.nextLine();
        switch (color){
            case "red":
            System.out.println(1);
            break;
            case "green":
            System.out.println (2);
            break;
            case "black":
            System.out.println (3);
            break;
            default:
            System.out.println ("Invalid color");
      
        } 
       
        }
    }