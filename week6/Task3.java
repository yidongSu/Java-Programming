import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101); 
        Scanner scanner = new Scanner(System.in);
        int guess = -1; 
        while (guess != number) { 
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
    }
}