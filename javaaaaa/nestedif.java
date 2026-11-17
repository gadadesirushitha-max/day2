import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        if (num > 0) {
            if (num >= 20){
                if(num>20){
                    System.out.println("The number is greater than or equal to 20");
                } 
                    System.out.println("The number is less than 20");
                }
            }
        }
    }

