import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}