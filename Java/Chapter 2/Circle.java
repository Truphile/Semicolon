import java.util.Scanner;

public class Circle{
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

        System.out.println("Diameter: " + (2 * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
        System.out.println("Area: " + (Math.PI * radius * radius));  
    }
}


