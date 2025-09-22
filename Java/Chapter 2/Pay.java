import java.util.Scanner;

public class Pay{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer score: ");
	int score = input.nextInt();

	double payHigh =  0.03;
	double payLess =  0.01;

	if(score > 90){
	payHigh = payHigh + score;
	System.out.printf("The increased pay is %.2f: " , payHigh);
	}
	else { payLess = payLess + score;
	}
	System.out.printf(" The increased pay is %.2f: " , payLess);
	}
}