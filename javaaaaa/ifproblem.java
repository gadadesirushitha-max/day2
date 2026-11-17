import java.util.Scanner;

public class ifproblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = obj.nextInt();
        if (a <= 10) {
            System.out.println("condition is true");
        }
        System.out.println("condition is false");
    }
}