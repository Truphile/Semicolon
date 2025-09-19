import java.util.Scanner;

public class Account{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter monthly amount : ");
	double month = input.nextInt();

	double rate = 0.00417;
	
	double first = 100 * (1 + rate);
	double second = (100 + first) * (1 + rate);
	double third = (100 + second) * (1 + rate);
	double forth = (100 + third) * (1 + rate);
	double fifth = (100 + forth) * (1 + rate);
	double sixth = (100 + fifth) * (1 + rate);

	System.out.printf("The value after the sixth month is %.2f: " , sixth);
	}
}