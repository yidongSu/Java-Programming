import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        
        while (data != 0) {
            sum += data;
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        
        System.out.println("The sum is " + sum);
    }
}