import java.util.Scanner;

public class SumNow{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer between 0 and 1000: ");
	int number = input.nextInt();
	
	int digit1 = number % 10;
	int digit2 = (number / 10) % 10;
	int digit3 = (number / 100) % 10;
	int digit4 = (number / 1000) % 10;

	int sumAll = digit1 + digit2 + digit3 + digit4;

	System.out.print("The sum of the digits is: " + sumAll );
	}
}