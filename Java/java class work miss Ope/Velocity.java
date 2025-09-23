import java.util.Scanner;

public class Velocity {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter velocity1 in meters: ");
	double velocity1 = input.nextDouble();
	
	System.out.print("Enter velocity2 in meters: ");
	double velocity2 = input.nextDouble();
	
	System.out.print("Enter t in secs: ");
	double t = input.nextDouble ();

	System.out.print(velocity2 - velocity1 / t);
	}
}
