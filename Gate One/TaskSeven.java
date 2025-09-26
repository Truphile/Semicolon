import java.util.Scanner;

public class TaskSeven{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
int count = 1;
int counter = 1;
int multiple = 1;
int sum = 0;

while(count <= 10){
	if (count % 4 == 0){

		while(counter <= 5){
		counter++;		
		multiple = multiple * count;
		sum = sum + multiple;
		System.out.println(sum);
		}
	
}
		count++;
		counter = 1;
		multiple = 1;
		sum = 0;
	}
}
}