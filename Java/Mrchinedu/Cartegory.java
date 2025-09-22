import java.util.Scanner;

public class Cartegory {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter user age: ");
	int age = input.nextInt();

	if (age == 0 && age <= 13) {
	System.out.println("The user is a child");
	} else if (age == 13 && age <= 20 ){
	System.out.println("The user is a teen");
	} else if (age == 20 && age <= 60){
	System.out.println("The user is an adult");
	} else  {
	System.out.println("The user is a senior");
	}

}
}