import java.util.Scanner;
public class LeapYear {
        public void leap_calc (int year){
        if (year%400==0 || year%4==0 ){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = s.nextInt();
        LeapYear ly = new LeapYear();
        ly.leap_calc(year);
    }
    
}
