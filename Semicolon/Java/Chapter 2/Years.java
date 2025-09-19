import java.util.Scanner;

public class Years{

       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Number of minutes: ");
       double mins = input.nextDouble();
       
       double hourMins = 60;
       double  dayHour = 24;
       double oneYear = 365;

       double minDay = hourMins * dayHour;
       double minGain = mins / minDay;

       double years = minGain / oneYear;
       double days = year / oneYear;

       System.out.printf("The number of years and days is %f%f: " , years , days);
       }
}


