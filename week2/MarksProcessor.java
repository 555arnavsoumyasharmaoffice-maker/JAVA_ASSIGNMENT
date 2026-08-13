import java.util.Scanner;

public class MarksProcessor {

    public static boolean M_ARKS(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public static boolean P_ASS(int mark) {
        return mark >= 50;
    }

    public static void D_ETAILS(int c, int su, int hi, int p, int f) {
        System.out.println("marks entered: " + c);
        System.out.println("Sum of the marks: " + su);
        System.out.println("Average mark: " + ((double) su / c));
        System.out.println("Highest mark: " + hi);
        System.out.println("Number of passes: " + p);
        System.out.println("Number of failures: " + f);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] m = new int[1000];
        int su = 0;
        int hi = Integer.MIN_VALUE;
        int p = 0;
        int f = 0;
        int c = 0;

        while (true) {
            System.out.print("Enter mark (-1 to end): ");
            int ma = s.nextInt();

            if (ma == -1) {
                break;
            }

            if (M_ARKS(ma)) {
                m[c] = ma;
                su += ma;
                if (ma > hi) {
                    hi = ma;
                }
                if (P_ASS(ma)) {
                    p++;
                } else {
                    f++;
                }
                c++;
            }
        }

        D_ETAILS(c, su, hi, p, f);
    }
}