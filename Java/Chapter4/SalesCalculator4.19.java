 import java.util.Scanner;

public class SalesCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int weeklyPay = 200;

	int money = 0;

	int answer = 0;
	double solution = 0;

	while( money >= 0){

	System.out.print("enter item sold(1-4): ");
	int item = input.nextInt();
				
	double rateWeeklyGross = 0.09;
				
	double  valueOne = 239.99;

	double  valuetwo = 129.75;

	double  valueThree = 99.95;

	double  valueFour = 350.89;
		
	double payRatePercent = 0;

	if(item == 1){
	payRatePercent = rateWeeklyGross * valueOne;
	}
	else if(item == 2){
	payRatePercent = rateWeeklyGross * valueTwo;
	}
	else if(item == 3){
	payRatePercent = rateWeeklyGross * valueThree;
	}
	else if(item == 4){
	payRatePercent = rateWeeklyGross * valueFour;
	}
					
	solution += payRatePercent;
				
				
System.out.print("include another item? (-1 to exit, 1 to continue): ");
money = input.nextInt();
				
}
double payout = solution + weeklyPay;
System.out.printf("salesperson payout for the week is %s",payout);





		}

	}
	