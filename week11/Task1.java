public class Task1 {
    public static void main(String[] args) {
int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
    {10, 11, 12}
};

System.out.println("array.length: " + array.length);
for (int i = 0; i < array.length; i++) {
    System.out.println("array[" + i + "].length: " + array[i].length);
}

try {
    System.out.println("array[4].length: " + array[4].length);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("ArrayIndexOutOfBoundsException");
}

    }
}