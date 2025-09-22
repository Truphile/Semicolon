import java.util.Scanner;

public class MultipleBook{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer number: ");
	int number = input.nextInt();
	
	if (number % 6 == 0){
	System.out.println("The number is a multiple of 6: " + number);
	} else {
	System.out.println("The number is not a multiple of 6: " + number);
	}
	if (number % 7 == 0){
	System.out.println("The number is a multiple of 7: " + number);
	} else {
	System.out.println("The number is not a multiple of 7: " + number);
	}
}
}