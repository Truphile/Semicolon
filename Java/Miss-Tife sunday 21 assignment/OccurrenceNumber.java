import java.util.Scanner;

public class OccurrenceNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter integers (end with 0): ");
	int number = input.nextInt();

int count = 0;
int max = 0;

while (number != 0){

	if (number > max ){
	max = number;
	count = 1;
	}else if (number == max){ 
	count++;
	}
	number = input.nextInt();
}	
System.out.println("The max number is: " + max);
System.out.println("The occurrence count of the largest number is: " + count );



	}
}