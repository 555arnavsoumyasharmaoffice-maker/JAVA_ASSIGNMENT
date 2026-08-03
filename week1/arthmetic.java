// arthmetic calculator 

import java.util.Scanner;
class Arthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("Choice: 1) +, 2) -, 3) *, 4) /");
        int c = sc.nextInt();

        int r;
        if (c == 1) {
            r=n1 + n2;
        } else if (c == 2) {
            r = n1 - n2;
        } else if (c == 3) {
            r= n1 * n2;
        } else if (c == 4) {
            if (n2 != 0) {
                r = n1 / n2;
            } else {
                System.out.println("Division by zero");
                return;
            }
        } else {
            System.out.println("wrong choice");
            return;
        }
        System.out.println("Result: " + r);
    }
}