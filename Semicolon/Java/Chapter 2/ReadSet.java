
import java.util.Scanner;

public class ReadSet{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int a = input.nextInt();

	System.out.print("Enter second number: ");
	int b = input.nextInt();

	System.out.print("Enter third number: ");
	int c = input.nextInt();

	int evenSum = 0;
	int oddSum = 0;

	if 
	(a % 2 == 0) { 
	evenSum = evenSum + a;
	}
	else{
	oddSum = oddSum + a;
	}
	if
	(b % 2 == 0) {
	evenSum = evenSum + b;
	}

	else
	{
	oddSum = oddSum + b;
	}
	if 
	(c % 2 == 0) {
	evenSum = evenSum + c;
	}
	else 
	 {
	oddSum = oddSum + c;
	} 
	System.out.println("The sum of even integers is: " + evenSum);
	System.out.println("The sum of odd integers is: " + oddSum);

	}
}