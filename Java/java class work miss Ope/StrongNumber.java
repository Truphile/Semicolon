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

public class StrongNumber{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int number = input.nextInt();
		int product = 1;
		int sum = 0;

	
		while(number != 1){
		int digit = number % 10;
	

		for(int count = digit; count > 0; count--){
			product = product * count;
			sum = sum + product
		}
			
			number = number / 10;

			   
	
		}
		System.out.println(sum);

		
	
		/*if (sum == number){
			System.out.println("The number is a Strong Number");
		} 
		else {
			System.out.println("The number is not a Strong Number");
		}										
								*/

	}
}