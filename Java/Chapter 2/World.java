import java.text.NumberFormat;
import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double ratePercent = input.nextDouble();
        double rate = ratePercent / 100.0;

        // Year 1
        double pop1 = population * (1 + rate);
        // Year 2
        double pop2 = pop1 * (1 + rate);
        // Year 3
        double pop3 = pop2 * (1 + rate);
        // Year 4
        double pop4 = pop3 * (1 + rate);
        // Year 5
        double pop5 = pop4 * (1 + rate);

        System.out.println("\nEstimated World Population Over 5 Years:");
        System.out.println("After 1 year: " +((long) pop1));
        System.out.println("After 2 years: " +((long) pop2));
        System.out.println("After 3 years: " + ((long) pop3));
        System.out.println("After 4 years: " +((long) pop4));
        System.out.println("After 5 years: " +((long) pop5));
    }
}
