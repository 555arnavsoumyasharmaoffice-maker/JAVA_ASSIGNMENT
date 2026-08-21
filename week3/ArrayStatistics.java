public class ArrayStatistics {
    public int sum(int[] a) {
        if (a.length == 0) 
            return 0;
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        return s;
    }
    public double average(int[] a)  {
        return (double) sum(a) / a.length;
    }
    public int minimum(int[] a) {
        int min = a[0]; 
        for (int i = 1 ; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public  int maximum(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return  max;
    }
    public int  countEven(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                c++;
            }
        }
        return c;
    }
    public void printSignCounts(int[]  a) {
        int p = 0, n = 0, z = 0;
        for (int i = 0; i < a.length;  i++) {
            if (a[i] > 0) p++;
            else if (a[i] < 0) n++;
            else z++;
        }
        System.out.println("Pos : " + p + ", Neg : " + n + ", Zero : " + z);
    }
    public static void main(String[] args) {
        ArrayStatistics ob = new ArrayStatistics();
        int[] a = {-3, 0, 5, -2, 8, 0, 11};
        System.out.println("Sum : " + ob.sum(a));
        System.out.println("Avg : " + ob.average(a));
        System.out.println("Min  : " + ob.minimum(a));
        System.out.println("Max: " + ob.maximum(a));
        System.out.println("Even  : " + ob.countEven(a));
        ob.printSignCounts(a);
    }
}