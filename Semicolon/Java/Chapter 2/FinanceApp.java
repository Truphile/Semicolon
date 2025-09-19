import java.util.Scanner;

public class FinanceApp {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("enter investment amount: ");
	double amount = scanner.nextDouble();
	
	System.out.print("enter annual rate: ");
	double rate = scanner.nextDouble();

	System.out.print("enter number of years: ");
	int year = scanner.nextInt();
	
	double month = rate / (100 * 12);
	
	double result =  Math.pow((1 + month), year * 12);
	double value = amount * result;

	System.out.printf("The future Investment value is %.2f$: " , value);
	}
}