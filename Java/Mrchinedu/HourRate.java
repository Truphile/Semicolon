import java.util.Scanner;

public class HourRate{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of hours worked: ");
	int hours = input.nextInt();

	System.out.print("Enter hourly rate %: ");
	int rate = input.nextInt();

	double totalPay = hours * rate;
	
	if (hours > 40){
	totalPay = (totalPay * 1.5);
	System.out.print(totalPay);
	}
}
}