import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2); 
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int maxRowIndex = -1;
        int maxColumnIndex = -1;
        int maxCount = 0;

        for (int i = 0; i < 4; i++) {
            int rowCount = countOnesInRow(matrix, i);
            if (rowCount > maxCount) {
                maxCount = rowCount;
                maxRowIndex = i;
            }

            int columnCount = countOnesInColumn(matrix, i);
            if (columnCount > maxCount) {
                maxCount = columnCount;
                maxColumnIndex = i;
            }
        }
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColumnIndex);
    }

    private static int countOnesInRow(int[][] matrix, int rowIndex) {
        int count = 0;
        for (int j = 0; j < 4; j++) {
            if (matrix[rowIndex][j] == 1) {
                count++;
            }
        }
        return count;
    }

    private static int countOnesInColumn(int[][] matrix, int columnIndex) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (matrix[i][columnIndex] == 1) {
                count++;
            }
        }
        return count;
    }
}