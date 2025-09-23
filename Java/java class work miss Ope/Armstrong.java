/* 	prompt user to enter a three digits number
	save as number
	find each digit of the number entered
	save as digit1
	save as digit2
	save as digit3

	How to find cube
	multiply each digit three times
	print the result
	
						*/


import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int number = input.nextInt();
		
		int digit1 = number / 100;
		int digit2 = (number % 100)/10;
		int digit3 = number % 10;

				
		int total1 = 0;
		for(int count = 1; count < 4; count++){
			total1 = digit2 * count * digit1 * count;
		}
		
			System.out.print(total1);

			
			


		/* int cubedigit1 = digit1 * digit1 * digit1;
		int cubedigit2 = digit2 * digit2 * digit2;
		int cubedigit3 = digit3 * digit3 * digit3;

		int sumCube = cubedigit1 + cubedigit3 + cubedigit2; 

		
		if (sumCube == number){
			System.out.println("The number is an Armstrong Number");
		} 
		else if (sumCube != number){
			System.out.println("The number is not a Armstrong Number"); 
		} */
		

	}
}