import java.util.Scanner;

public class MiniAssistant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for name
        System.out.print("What is your name? ");
        String name = input.nextLine();

        // Ask for age
        System.out.print("Hi " + name + "! How old are you? ");
        int age = input.nextInt();
        input.nextLine(); // clear buffer

        // Age response
        if (age < 13) {
            System.out.println("You are a young explorer!");
        } else if (age <= 19) {
            System.out.println("Teen life is fun, enjoy it!");
        } else if (age <= 59) {
            System.out.println("Adulting can be challenging, stay strong!");
        } else {
            System.out.println("Wisdom looks good on you!");
        }

        // Ask mood
        System.out.print("How do you feel today (happy, sad, excited, tired)? ");
        String mood = input.nextLine();

        if (mood.equalsIgnoreCase("happy")) {
            System.out.println("Keep smiling!");
        } else if (mood.equalsIgnoreCase("sad")) {
            System.out.println("Cheer up! Tomorrow is a new day.");
        } else if (mood.equalsIgnoreCase("excited")) {
            System.out.println("Awesome! Enjoy your energy!");
        } else if (mood.equalsIgnoreCase("tired")) {
            System.out.println("Rest well and recharge!");
        } else {
            System.out.println("I hope you feel good!");
        }

        // Guessing game (fixed number instead of Random)
        int secret = 7; // fixed number
        System.out.print("Guess a number between 1 and 10: ");
        int guess = input.nextInt();

        if (guess == secret) {
            System.out.println("Wow! You guessed it!");
        } else {
            System.out.println("Try again next time! The number was " + secret);
        }

    
        System.out.print("Do you want a suggestion for the day (yes/no)? ");
        String ans = input.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            if (mood.equalsIgnoreCase("happy")) {
                System.out.println("Go out and play a sport you like!");
            } else if (mood.equalsIgnoreCase("sad")) {
                System.out.println("Take a short walk outside and get some fresh air.");
            } else if (mood.equalsIgnoreCase("excited")) {
                System.out.println("Share your excitement by helping someone!");
            } else if (mood.equalsIgnoreCase("tired")) {
                System.out.println("Have a short nap or rest to recharge.");
            }
        }

        System.out.println("Goodbye " + name + "! Have a great day!");
    
}
