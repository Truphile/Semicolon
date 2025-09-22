import java.util.Scanner;

public class Collect {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("enter number in feets: ");
	double feets = scanner.nextDouble();

	double meters = feets * 0.305;
	
	System.out.printf("The feets in meter is %.2f" , meters);
	}
}
		
