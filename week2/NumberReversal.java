import java.util.Scanner;
public class NumberReversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = s.nextInt();
        int rn = 0;

        while (n != 0) {
            int digit = n % 10;
            rn = rn * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + rn);
    }
}