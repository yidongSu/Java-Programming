import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int numColumns = scanner.nextInt();
        
        System.out.println("\nMultiplication Table:");
        
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numColumns; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}