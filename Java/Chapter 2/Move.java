import java.util.Scanner;

public class Move {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter initial value: ");
	double miles = input.nextDouble();

	double KILOMETERS_PER_MILE = 1.609;
	
	double kilometers = miles * KILOMETERS_PER_MILE;

	System.out.printf("The number of kilometer is %f " , kilometers);
	}
}