import java.util.Scanner;

public class Driving {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter driving distance: ");
	double distance = input.nextDouble();

	System.out.print("Enter gallon per mile: ");
	double mile = input.nextDouble();

	System.out.print("Enter price per gallon: ");
	double price = input.nextDouble();
	
	double cost = distance * price / mile;

	System.out.printf("The cost of driving is $%.4f" , cost);
	}
}