import java.util.Scanner;
public class ArrayTransformations {
    public void reverseInPlace(int[] v) {
        int n=v.length;
        int s=0;
        int e=n-1;
        while(s<e){
            int tp=v[s];
            v[s]=v[e];
            v[e]=tp;
            s++;
            e--;
        }
    }
    public int[] reversedCopy(int[] v) {
        int n=v.length;
        int[] rc=new int[n];
        for(int i=0;i<n;i++){
            rc[i]=v[n-1-i];
        }
        return rc;
    }
    public int removeValue(int[] v, int t) {
        int n=v.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(v[i]!=t){
                v[c]=v[i];
                c++;
            }
        }
        return c;
    }
    public int[] runningSum(int[] v) {
        int n=v.length;
        int[] rs=new int[n];
        rs[0]=v[0];
        for(int i=1;i<n;i++){
            rs[i]=rs[i-1]+v[i];
        }
        return rs;
    }
    public void pt(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public void ptl(int[] a, int l) {
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public int[] in(int sz) {
        int[] a=new int[sz];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<sz;i++){
            int n=sc.nextInt();
            a[i]=n;
        }
        return a;
    }
    public static void main(String[] args) {
        ArrayTransformations ob=new ArrayTransformations();
        int[] ar={1,2,3,2,4,2,5};
        System.out.print("Original: ");
        ob.pt(ar);
        System.out.print("Copy: ");
        int[] rc=ob.reversedCopy(ar);
        ob.pt(rc);
        System.out.print("Sum: ");
        int[] rs=ob.runningSum(ar);
        ob.pt(rs);
        System.out.print("Reverse: ");
        ob.reverseInPlace(ar);
        ob.pt(ar);
        System.out.print("Remove 2: ");
        int vl=ob.removeValue(ar, 2);
        ob.ptl(ar, vl);
    }
}