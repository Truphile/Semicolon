/* 	prompt user to enter a three digits number
	save as number
	find each digit of the number entered
	save as digit1
	save as digit2
	save as digit3

	How to find factorial
	create a variable total which is equal to 1
	for another variable created which is count should be equal to first digit(digit1)
	this should run while count is greater than zero
	count should decrease by one
	total should be equal to total multiply count


	find the factorial of first digit
	find the factorial of second digit
	find the factorial of first digit
	sum up the factorial of the three digit
	if sum of factorial is equal to number
	print out it is a strong number, if not
	print out it is not a strong number
	
						*/


import java.util.Scanner;

public class StrongDigit{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int number = input.nextInt();
		
		int digit1 = number / 100;
		int digit2 = (number % 100)/10;
		int digit3 = number % 10;
	
		int total1 = 1;
		for(int count = digit1; count > 0; count--){
			total1 = total1 * count;
		}
	
		int total2 = 1;
		for(int count1 = digit2; count1 > 0; count1--){
			total2 = total2 * count1;
		}
	

		int total3 = 1;
		for(int count2 = digit3; count2 > 0; count2--){
			total3 = total3 * count2;
		}
		
		int sumTotal = total1 + total2 + total3;
	
		if (sumTotal == number){
			System.out.println("The number is a Strong Number");
		} 
		else if (sumTotal != number){
			System.out.println("The number is not a Strong Number");
		}
		

	}
}