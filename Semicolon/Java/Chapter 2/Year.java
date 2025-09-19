import java.util.Scanner;

public class Year{

       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Number of minutes: ");
       int mins = input.nextInt();
       
       int hourMins = 60;
       int  dayHour = 24;
       int oneYear = 365;

       int minDay = hourMins * dayHour;
       int minGain = mins / minDay;

       int years = minGain / oneYear;
       int days = minGain % oneYear;


       System.out.printf("The number of years %d and days is %d " , years , days);
       }
}


