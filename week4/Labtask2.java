package week4;

import java.util.Scanner;

public class Labtask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        int time = sc.nextInt();
        int minutes = time / 60;
        int remainningseconds = time % 60;
        System.out.println(minutes + ":" + remainningseconds);

    }
}