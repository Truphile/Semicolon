/*
- prompt the user write first score
- prompt the user write another score
- prompt the user write the third score
- then add the three score together 
- make e divide the result from the addition of the three scores by 3 naso to get the average
- come use the average compare to grades 'A to F'
*/


import java.util.Scanner;

public class ScoreGrades{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
int total = 0;	
int count = 1;
int score = 0;

for (int i = 0; count <= 3; count++){
	System.out.print("Enter an integer score: ");
	 score = input.nextInt();
         
	 total += score;
	}

int average = total / 3;



/*int addition_scores = first_score + second_score + third_score 
/*print(addition_scores)
*/
/*int average_score = addition_scores / 3:*/

System.out.println("The average score: " + average);


if (90 <= average &&  average <= 100){
	System.out.print("Your grade is A");
}
else if (80 <= average  &&  average < 90){
	System.out.print("Your grade is B");
}
else if (70 <= average  &&  average < 80){
	System.out.print("Your grade is C");
}
else if (60 <= average  &&  average < 70){
	System.out.print("Your grade is D");
}
else {
	System.out.print("Your grade is F");
}

	}
}

