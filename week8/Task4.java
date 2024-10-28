public class Task4 {
    public static void main(String[] args) {

        double[] myList = new double[5];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 10;
        }

        System.out.println("Array elements:");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}