import java.util.Scanner;

public class BodyMass {
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("enter weight in pounds: ");
		double weight = scanner.nextDouble();

		System.out.print("enter height in inches: ");
		double height = scanner.nextDouble();

		double kilogram = weight * 0.45359237;
		double meters = height * 0.0254;

		double Bmi = kilogram / meters * meters

		System.out.printf("Bmi is %.2f", Bmi);
	}
}
