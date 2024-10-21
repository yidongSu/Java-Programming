import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        
        int startDay = calculateStartDay(year, month);

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("--------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        int numDaysInMonth = getNumDaysInMonth(year, month);
        for (int day = 1; day <= numDaysInMonth; day++) {
            System.out.printf("%3d", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        int endDay = (numDaysInMonth + startDay) % 7;
        if (endDay != 0) {
            for (int i = 0; i < (7 - endDay); i++) {
                System.out.print("   ");
            }
        }

        System.out.println(); 
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }

    private static int getNumDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int calculateStartDay(int year, int month) {

        if (month < 3) {
            month += 12;
            year--;
        }

        int q = 1; 
        int m = month;
        int K = year % 100;
        int J = year / 100;

         h = (q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K / 4) + Math.floor(J / 4) - 2 * J) % 7;

        return (h + 6) % 7; 
    }
}