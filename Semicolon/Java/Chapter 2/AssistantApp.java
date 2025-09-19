import java.util.Scanner;

public class AssistantApp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter user name: ");
	String name = input.nextLine();
	
	System.out.println("Hello " + name + "! Welcome to your personal assistant.");
	
	System.out.print("Hi " + name + " Enter user age: ");
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

	input.nextLine();
	System.out.print("How do you feel today (happy, sad, excited, tired)? ");
	String mood = input.nextLine();
	
	if (mood.equals("happy")) {
        System.out.println("Keep smiling!");
        } if (mood.equals("sad")) {
        System.out.println("Cheer up! Tomorrow is a new day.");
        } if (mood.equals("excited")) {
        System.out.println("Awesome! Enjoy your energy!");
        } if (mood.equals("tired")) {
        System.out.println("Rest well and recharge!");
       }
	
	int secret = 3;
        System.out.print("Guess a number between 1 and 10: ");
        int guess = input.nextInt();
	
	if (guess == secret) {
        System.out.println("Wow! You guessed it!");
        } else {
        System.out.println("Try again next time! The number was " + secret);
        }
	
	input.nextLine();
	System.out.print("Do you want a suggestion for the day (yes/no)? ");
        String suggest = input.nextLine();

	if (suggest.equals("yes")) {
        if (mood.equals("happy")) {
        System.out.println("Go out and play a sport you like!");
        } else if (mood.equals("sad")) {
        System.out.println("Take a short walk outside and get some fresh air.");
        } else if (mood.equals("excited")) {
        System.out.println("Share your excitement by helping someone!");
        } else if (mood.equals("tired")) {
        System.out.println("Have a short nap or rest to recharge.");
        }
      } else {
	System.out.println("No worries! Have a great day anyway! ");
	}
	
	

}
}