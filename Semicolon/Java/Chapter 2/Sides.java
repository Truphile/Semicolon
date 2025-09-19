import java.util.Scanner;

public class Sides{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer: ");
	double x1 = input.nextDouble();

	System.out.print("Enter second integer: ");
	double y1 = input.nextDouble();

	System.out.print("Enter third integer: ");
	double x2 = input.nextDouble();

	System.out.print("Enter fourth integer: ");
	double y2 = input.nextDouble();

	System.out.print("Enter fifth integer: ");
	double x3 = input.nextDouble();

	System.out.print("Enter sixth integer: ");
	double y3 = input.nextDouble();

	double a = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
	double side1 = Math.sqrt (a);
	double b = (x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2);
	double side2 = Math.sqrt (b);
	double c = (x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3);
	double side3 = Math.sqrt (c);

	double s = (side1 + side2 + side3) / 2;
	double z = (s*(s - side1)*(s - side2)*(s - side3));
	
	double area = Math.sqrt (z);

	System.out.printf("The area of the triangle is %f: " , area);
	}
}
	

