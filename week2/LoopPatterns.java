
import java.util.Scanner;
public class LoopPatterns {
    public static void A(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void B(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int si = s.nextInt();
        if (si < 1) {
            System.out.println("Size must be at least 1.");
            return;
        }
        System.out.println("Pattern A:");
        A(si);
        System.out.println("Pattern B:");
        B(si);
        System.out.println("Pattern C:");
        for (int i = 1; i <= si; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern D:");
        for (int i = si; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern E:");
      
        for (int i = 1; i <= si; i++) {
           
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
