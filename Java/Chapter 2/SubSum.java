import java.util.Scanner;

public class SubSum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer subtotal: ");
	double subTotal = input.nextDouble();

	System.out.print("Enter an integer gratuity rate in %: ");
	double rate = input.nextDouble();

	double gratuity = (subTotal * rate) / 100;
	double total = subTotal + gratuity;

	System.out.printf("The gratuity is %f and tOtal is %f: " , gratuity , total );
	}
}
