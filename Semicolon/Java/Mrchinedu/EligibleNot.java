import java.util.Scanner;

public class EligibleNot{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter attendance percentage %: ");
	double attend = input.nextDouble();
	
	System.out.print("Enter average score: ");
	double score = input.nextDouble();
	
	if (attend == 75 && attend > 75){
	System.out.print("Eligible");
	}
	else if (score == 75 && attend > 75){
	System.out.print("Eligible");
	} else { 
	System.out.print("Not eligible");
	}
}
}