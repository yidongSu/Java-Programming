package week4;

import java.util.Scanner;

public class Labtask9 {
    public static void main(String[] args) {
        final double INTEREST_RATE = 1.00417;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        savingAmount *= INTEREST_RATE;
        for (int i = 1; i < 6; i++) {
            savingAmount = INTEREST_RATE * savingAmount + 100;
        }
        System.out.println("After 6 months, the amount is " + savingAmount);
    }
}
