public class z1_13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        
        double denominator = a * d - b * c;
        
        if (denominator != 0) {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("The equation has no solution because ad - bc is zero.");
        }
    }
}
