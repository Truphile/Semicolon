/* 	prompt user to enter a number three digits number
	save as number
	break the number down to get each digit of the number
	assemble the number
	assign it to another variable called reverse
	print reverse					*/


import java.util.Scanner;

public class Reverse{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int number = input.nextInt();
		
		int digit1 = number / 100;
		int digit2 = (number % 100)/10;
		int digit3 = number % 10;

		int reverseDigit1 = digit3 * 100;
		int reverseDigit2 = digit2 * 10;
		int reverse = reverseDigit1 + reverseDigit2 + digit1;
		System.out.print(reverse);
	}	

}