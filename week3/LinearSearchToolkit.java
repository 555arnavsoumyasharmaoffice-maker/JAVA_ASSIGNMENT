public class LinearSearchToolkit {
    public boolean contains(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }
        return false;
    }
    public int firstIndexOf(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }
    public int lastIndexOf(int[] a, int x) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == x) return i;
        }
        return -1;
    }
    public int countOccurrences(int[] a, int x) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        LinearSearchToolkit ob = new LinearSearchToolkit();
        int[] a = {10, 20, 30, 20, 40};

        System.out.println(ob.contains(a, 20));
        System.out.println(ob.firstIndexOf(a, 20));
        System.out.println(ob.lastIndexOf(a, 20));
        System.out.println(ob.countOccurrences(a, 20));
    }
}