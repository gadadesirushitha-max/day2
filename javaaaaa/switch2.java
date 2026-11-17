import java.util.Scanner;
public class switch2 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        switch(num){
            case 1:
                System.out.println("CSE");
                break;
            case 2:
                System.out.println("IT");
                break;
            case 3:
                System.out.println("ECE");
                break;
            default:
                System.out.println("Invalid branch");
        }
    }
    
}
