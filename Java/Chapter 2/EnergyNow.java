import java.util.Scanner;

public class EnergyNow {

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter amount of water in kilograms: ");
	double kilo = input.nextDouble();

	System.out.print("Enter initialTemperature: ");
	double temp0 = input.nextDouble();

	System.out.print("Enter finalTemperature: ");
	double temp1 = input.nextDouble();

	double energyNeed = kilo * (temp1 - temp0) * 4184;

	System.out.printf("The energy needed is %.1f:" , energyNeed);
	}
}