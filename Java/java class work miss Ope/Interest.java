import java.util.Scanner;

public class Interest {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter balance ");
	double balance = input.nextDouble();

	System.out.print("Enter annualInterestRate % ");
	double rate = input.nextDouble();
	
	double interest = balance * rate / 1200;

	System.out.print("The interest for the month is " + interest);
	}
}

	