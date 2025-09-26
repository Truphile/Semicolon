
/*
step 1 - prompt user to write father's current age from age 1 to age 80
step 2 - prompt user to write collect son's current age from age 1 to age 80
step 3 - substract the son's age from the father's age
step 4 - then subtract the age of the son from the result of step 3 to get the years
step 5 - then you compare the years to be equal to or greater than zero
step 6 - print result

*/

import java.util.Scanner;

public class AgeCheck{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter father current age:  ");
	int father = input.nextInt();

	System.out.print("Enter son current age:  ");
	int son = input.nextInt();

int ageDifference = (father - son);

int yearDifference = (ageDifference - son);



if (yearDifference >= 0){
	yearDifference = yearDifference;

if (father > son && father <= 80 && son >=1);

	System.out.println("Number of years ago " + yearDifference);
}else {
	System.out.println("invalid input");
}


}

}