import java.util.Scanner;

public class Number {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first numbers");
	int number = input.nextInt();
	
	System.out.println("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.println("Enter third number: ");
	int thirdNumber = input.nextInt();

	System.out.println("Enter fourth number: ");
	int fourthNumber = input.nextInt();

	System.out.println("Enter fifth number: ");
	int fifthNumber = input.nextInt();
	
	System.out.println(number + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber);

}
}