import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        double[] myList = new double[5];


        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " Values");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        input.close();
    }
}