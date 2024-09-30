package week3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = sc.nextDouble();
        weight=weight*0.45359237;
        height=height*0.0254;

        double BMI = weight / (height * height);

        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String formattedBMI = decimalFormat.format(BMI);


        System.out.println("BMI is "+ formattedBMI);

    }
}
