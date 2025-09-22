import java.util.Scanner;

public class AccountBalance{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int balance = input.nextInt();

	if ( balance < 100){
	System.out.print("Low");
	} else if (balance = 100 && balance < 1000){
	System.out.print("Medium");
	} else {
	System.out.print("High");
	}
}
}