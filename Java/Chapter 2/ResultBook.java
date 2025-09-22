import java.util.Scanner;

public class ResultBook{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer first number: ");
	double first = input.nextDouble();

	System.out.print("Enter an operator (-,+,/,*): ");
	char operator = input.next().charAt(0);

	System.out.print("Enter an integer second number: ");
	double second = input.nextDouble();

	double result;
	
	if (operator == '+') {
	result = first + second;
	System.out.println("The result: " + result);
}	else if (operator == '-') {
	result = first - second;
	System.out.println("The result: " + result);
}	else if (operator == '*') {
	result = first * second;
	System.out.println("The result: " + result);
}	else if (operator == '/') {
	result = first / second;
	System.out.println("The result: " + result);
}
	}
}