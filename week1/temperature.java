// use easy names

import java.util.Scanner;
public class temperature{
    public static void main() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius or Fahrenheit: ");
        int t  = inp.nextInt();
        System.out.println("Enter unit (1 for Celsius, 2 for Fahrenheit): ");
        int u = inp.nextInt();


        int convt;
        if (u == 1) {
            convt = (t * 9/5) + 32;
        } else {
           
            convt = (t - 32) * 5/9;
        }

        System.out.println("Converted temperature: " + convt);


    }
}
