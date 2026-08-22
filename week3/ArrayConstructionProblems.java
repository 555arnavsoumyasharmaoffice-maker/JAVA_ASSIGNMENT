import java.util.Scanner;
public class ArrayConstructionProblems {
    public int finalValueAfterOperations(String[] op){
        int X = 0;
        for(String s : op){
            if(s.contains("+")) X++;
            else X--;
        }
        return X;
    }
    public int[] buildArray(int[] a){
        int n=a.length;
        int[] ans =new int[n];
        for(int i=0;i<n;i++){
            ans[i]= a[a[i]];
        }
        return ans;
    }
    public int[] getConcatenation(int[] a) {
        int n = a.length;
        int[] ans = new int[ 2*n];
        for(int i=0; i<n; i++){
            ans[i] = a[i];
            ans[i+n] = a[i];
        }
        return ans;
    }
    public int[] runningSum(int[] a){
        int n=a.length;
        int[] ans=new int[n];
        ans[0]=a[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+a[i];
        }
        return ans;
    }  
}