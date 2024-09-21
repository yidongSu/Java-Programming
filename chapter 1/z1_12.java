public class z1_12 {
    public static void main(String[] args) {
        double miles = 24.0;
        double totalTimeInMinutes = 1 * 60 + 40 + 35.0 / 60.0;
        double timeInHours = totalTimeInMinutes / 60.0;
        double milesToKilometers = 1.6;

        double kilometers = miles * milesToKilometers;

        double averageSpeed = kilometers / timeInHours;

        System.out.println("Average speed: " + averageSpeed + " kilometers per hour");
    }
}
