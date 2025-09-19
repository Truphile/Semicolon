import java.util.Scanner;

public class Lengthy {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter integer v in m/s: ");
	double v = input.nextDouble();

	System.out.print("Enter integer a in m/s sqr: ");
	double a = input.nextDouble();

	double length = (v*v)/(2*a);
	
	System.out.printf("The minimum runway length of this airplane %f: " , length);
	}
}