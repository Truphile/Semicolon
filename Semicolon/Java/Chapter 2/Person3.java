import java.util.Scanner;

public class Person3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first name: ");
	String firstPerson = input.nextLine();

	System.out.print("Enter second name: ");
	String secondPerson = input.nextLine();

	System.out.print("Enter third name: ");
	String thirdPerson = input.nextLine();

	System.out.print("Enter first age: ");
	int firstAge = input.nextInt();

	System.out.print("Enter second age: ");
	int secondAge = input.nextInt();

	System.out.print("Enter third age: ");
	int thirdAge = input.nextInt();

	if (firstAge >= secondAge && firstAge >= thirdAge){
	System.out.printf("The oldest person is %s: " , firstPerson , firstAge);
	} if (secondAge >= firstAge && secondAge >= thirdAge){
	System.out.printf("The oldest person is %s: " , secondPerson , secondAge);
	} if (thirdAge >= firstAge && thirdAge >= secondAge){
	System.out.printf("The oldest person is %s: " , thirdPerson , thirdAge);
	}
	if (firstAge <= secondAge && firstAge <= thirdAge){
	System.out.printf("The youngest person is %s: " , firstPerson , firstAge);
	} if (secondAge <= firstAge && secondAge <= thirdAge){
	System.out.printf("The youngest person is %s: " , secondPerson , secondAge);
	} if (thirdAge <= firstAge && thirdAge <= secondAge){
	System.out.printf("The youngest person is %s: " , thirdPerson , thirdAge);
	}

}
}
	
	