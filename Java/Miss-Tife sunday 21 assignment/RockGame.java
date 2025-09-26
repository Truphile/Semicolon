import java.util.Scanner;

public class RockGame{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0, compWins = 0;

        while (Math.abs(userWins - compWins) <= 2) {
            System.out.print("Enter 0 (Scissor), 1 (Rock), 2 (Paper): ");
            int user = input.nextInt();
            int comp = (int)(Math.random() * 3);

           
            System.out.println("You: " + user + "  Computer: " + comp);

           
            if (user == comp) {
                System.out.println("Draw.");
            } else if ((user == 0 && comp == 2) ||
                       (user == 1 && comp == 0) ||
                       (user == 2 && comp == 1)) {
                userWins++;
                System.out.println("You win this round!");
            } else {
                compWins++;
                System.out.println("Computer wins this round!");
            }

            System.out.println("Score " + userWins + "  Computer: " + compWins + "\n");

            if (Math.abs(userWins - compWins) > 2) break;
        }

        if (userWins > compWins)
            System.out.println(" You win the game!");
        else
            System.out.println(" Computer wins the game!");
    }
}
