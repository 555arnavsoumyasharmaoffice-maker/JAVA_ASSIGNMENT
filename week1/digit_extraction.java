import java.util.Scanner;

public class digit_extraction {
    public static void main(String... a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter num: ");
        int n = sc.nextInt();

        int d1 = n % 10;
        n = n / 10;

        int d2 = n % 10;
        n = n / 10;

        int d3 = n % 10;

        System.out.println("hunderdth = " + d3);
        System.out.println("tens = " + d2);
        System.out.println("units = " + d1);
    }
}