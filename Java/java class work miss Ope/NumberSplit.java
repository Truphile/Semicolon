import java.util.Scanner;

public class NumberSplit{
	public static void main(String[] args){
	Scanner frame = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int n = frame.nextInt();

	int m = n;
	int sum =1;
	while(n != 0){
	int breakNumber = n % 10;
	n = n / 10;
	sum = sum + breakNumber;
	
}
	System.out.println(sum);
	}
}