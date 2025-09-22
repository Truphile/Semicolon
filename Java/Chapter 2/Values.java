import java.util.Scanner;

public class Values {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int Positive = 0;
	int Negative = 0;
	int Zero = 0;

	System.out.println("Enter first number:");

	int firstNumber = input.nextInt();
	if (firstNumber > 0) {
	Positive = Positive + 1;
	}
	else if (firstNumber < 0) {
	Negative = Negative + 1;
	}
	else {
	Zero = Zero + 1;
	}	
	System.out.println("Enter second number:");

	int secondNumber = input.nextInt();
	if (secondNumber > 0) {
	Positive = Positive + 1;
	}
	else if (secondNumber < 0) {
	Negative = Negative + 1;
	}
	else {
	Zero = Zero + 1;
	}
	System.out.println("Enter third number:");

	int thirdNumnber = input.nextInt();
	if (thirdNumnber > 0) {
	Positive = Positive + 1;
	}
	else if (thirdNumnber < 0) {
	Negative = Negative + 1;
	}
	else {
	Zero = Zero + 1;
	}
	System.out.println("Enter fourth number:");
	
	int fourthNumber = input.nextInt();
	if (fourthNumber > 0) {
	Positive = Positive + 1;
	}
	else if (fourthNumber < 0) {
	Negative = Negative + 1;
	}
	else {
	Zero = Zero + 1;
	}
	System.out.println("Enter fifth number:");

	int fifthhNumber = input.nextInt();
	if (fifthhNumber > 0) {
	Positive = Positive + 1;
	}
	else if (fifthhNumber < 0) {
	Negative = Negative + 1;
	}
	else {
	Zero = Zero + 1;
	}
	System.out.println("Positive number " + Positive);
	System.out.println("Negative number " + Negative);
	System.out.println("Zeros " + Zero);	
}
}
