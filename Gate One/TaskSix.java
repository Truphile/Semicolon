import java.util.Scanner;

public class TaskFive{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
int count = 1;
int counter = 1;
int multiple = 1;

while(count <= 10){
	if (count % 4 == 0){

		while(counter <= 5){
		System.out.print(multiple);
		counter++;		
		multiple = multiple * count;
	
}
count++;
counter = 1;

		}
	}
}
}