import java.util.Scanner;

public class Convert {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("enter number in pounds: ");
	double pounds = scanner.nextDouble();

	double kilogram = pounds * 0.454;
	
	System.out.printf("The pounds in kilogram is %.2f" , kilogram);
	}
}
		
