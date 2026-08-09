import java.util.Scanner;
public class MenuCalculator {
    public void menu(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args){
        MenuCalculator m=new MenuCalculator();
        m.menu();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the choice : ");
        int c= s.nextInt();
        System.out.println("Enter the first number : ");
        int a= s.nextInt(); 
        System.out.println("Enter the second number : ");
        int b= s.nextInt(); 
        if (c==1){
            System.out.println("Addition is : "+m.add(a,b));
        }
        else if (c==2){
            System.out.println("Subtraction is : "+m.sub(a,b));
        }
        else if (c==3){
            System.out.println("Multiplication is : "+m.mul(a,b));
        }
        else if (c==4){
            System.out.println("Division is : "+m.div(a,b));
        }
        else{
            System.out.println("Exit");
        }

    }
}
