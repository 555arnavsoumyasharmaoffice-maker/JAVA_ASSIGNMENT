import java.util.Scanner;

public class BitMaskUtility {
  boolean isBitSet(int n, int p) {
        return (n & (1 << p)) != 0;
}
    int setBit(int n, int p) {
   return n | (1 << p);
}
  int clearBit(int n, int p) {
        return n & ~(1 << p);
    }
int toggleBit(int n, int p) {
    return n ^ (1 << p);
  }
    String toBinary32(int n) {
  String s = "";
        for (int i = 31; i >= 0; i--) {
        s += ((n >> i) & 1);
   }
    return s;
 }
  public static void main(String[] args) {
  BitMaskUtility ob = new BitMaskUtility();
Scanner sc = new Scanner(System.in);
    while (true) {
   System.out.println("\n1. Is Bit Set\n2. Set Bit\n3. Clear Bit\n4. Toggle Bit\n5. Exit");
     System.out.print("Choice: ");
   int ch = sc.nextInt();
   if (ch == 5) break;
   System.out.print("Enter number: ");
        int n = sc.nextInt();
      System.out.print("Enter position (0-31): ");
  int p = sc.nextInt();
     if (p < 0 || p > 31) {
    System.out.println("Invalid position!");
    continue;
     }
  System.out.println("Before Decimal: " + n);
      System.out.println("Before Binary : " + ob.toBinary32(n));
   int r = n;
      if (ch == 1) {
      System.out.println("Is Set: " + ob.isBitSet(n, p));
     } else if (ch == 2) {
        r = ob.setBit(n, p);
   } else if (ch == 3) {
         r = ob.clearBit(n, p);
   } else if (ch == 4) {
      r = ob.toggleBit(n, p);
     } else {
     System.out.println("Wrong choice!");
        continue;
     }
   if (ch != 1) {
   System.out.println("After Decimal: " + r);
       System.out.println("After Binary : " + ob.toBinary32(r));
       }
  }
}
}