import java.util.Scanner;
public class ifelseproblem {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter marks: ");
        if (obj.hasNextInt()) {
            int marks = obj.nextInt();
            if (marks >= 90) {
                System.out.println("Excellent");
            } else if (marks >= 80) {
                System.out.println(" very Good");
            } else if (marks >= 70) {
                System.out.println("Good");
            } else if (marks >= 60) {
                System.out.println("Average");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
