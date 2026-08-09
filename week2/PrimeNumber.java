import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        PrimeNumber p=new PrimeNumber();
        System.out.print("Enter a number : ");
        int n=s.nextInt();
        if (p.isPrime(n)){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its not a prime number");
        }

    }
}
