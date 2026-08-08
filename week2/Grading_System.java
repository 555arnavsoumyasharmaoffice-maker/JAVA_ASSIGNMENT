import java.util.Scanner;
public class Grading_System {
    public String grading(int marks){
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80 && marks < 90) {
            grade = "B";
        } else if (marks >= 70 && marks < 80) {
            grade = "C";
        } else if (marks >= 60 && marks < 70) {
            grade = "D";
        } else if (marks >= 50 && marks < 60) {
            grade = "E";
        } else {
            grade = "F";
        }
        return grade;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int ma = s.nextInt();


        Grading_System gs = new Grading_System();
        System.out.println("Your grade is: " + gs.grading(ma));
    }
}