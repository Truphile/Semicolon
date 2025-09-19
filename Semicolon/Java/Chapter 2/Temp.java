import java.util.Scanner;

public class Temp{
	
      	public static void main(String[] args){
       	Scanner input = new Scanner(System.in);
       	System.out.print("Amount of water in kilogram: ");
       	double kilo = input.nextDouble();

       	System.out.print("Enter finalTemperature: ");
       	double temp1 = input.nextDouble();

       	System.out.print("Enter initialTemperature: ");
       	double temp0 = input.nextDouble();

       	double weight = kilo * ( temp1 - temp0 ) * 4184;

      	System.out.printf("The energy needed is %f:  " ,  weight);
      	}
}