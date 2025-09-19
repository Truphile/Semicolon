import java.util.Scanner;

public class Assistant{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter user name: ");
	String name = input.nextLine();
	
	System.out.print("Hi " + name + "Enter user age: ");
	int age = input.nextInt();

	if (age <= 13){
	System.out.println("You are a younger explore!");
	} else if (age <= 19){
	System.out.println("Teen life is fun, enjoy it!");
	} else if (age <= 59){
	System.out.println("Adulting can be challenging, stay strong!");
	} else {
	System.out.println("Wisdom looks good on you!");
	}

	System.out.print("Enter user mood today (happy,sad,excited,tired): ");
	String mood = input.nextLine();

	if (mood.equals("happy")){ 
	System.out.print("Keep smilling!");
	}

	System.out.print("Enter an integer from 1 to 10: ");
	int number = input.nextInt();

	
	System.out.print("Do you want a suggestion for the day? (yes,no): ");
	String suggest = input.nextLine();

	


	 if (suggest.equals("yes")){
	System.out.print("Go out and play asport you like!");
	}else{
	System.out.print("No worries! Have a great day anyway!");
	}
	
	System.out.println("Hello, + name! welcome to your personal assistant. ");
 	}
}