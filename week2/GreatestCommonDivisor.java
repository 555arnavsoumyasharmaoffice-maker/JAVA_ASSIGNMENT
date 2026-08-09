
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
