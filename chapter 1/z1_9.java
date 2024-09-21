public class z1_9 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double totalTimeInMinutes = 45.0 + 30.0 / 60.0;
        double timeInHours = totalTimeInMinutes / 60.0;
        double kilometersToMiles = 1.6;
        
        double miles = kilometers / kilometersToMiles;
        
        double averageSpeed = miles / timeInHours;
        
        System.out.println("Average speed: " + averageSpeed + " miles per hour");
    }
}
