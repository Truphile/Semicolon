import java.util.Scanner;

public class Trial{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int digit = scanner.nextInt();

		int count = 0;
		while (count < 3){
			count = count + 1;
			sum = digit * digit;
			System.out.println(digit);

		}
	}
}