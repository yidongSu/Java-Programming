import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        
        double minNumber = min(array);
        System.out.println("The minimum number is " + minNumber);
    }

    public static double min(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
}