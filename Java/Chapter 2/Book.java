import java.util.Scanner;

public class Book{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter user name: ");
	String name = input.nextLine();
	System.out.println("My name is " + name);
	}
}