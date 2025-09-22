import java.util.Scanner;

public class BalanceCheck {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter bank balance: ");
    double balance = input.nextDouble();

    if (balance < 100) {
    System.out.println("Low");
    } else if (balance <= 1000) {
    System.out.println("Medium");
    } else {
    System.out.println("High");
    }
    }
}