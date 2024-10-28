public class Task7 {
    public static void main(String[] args) {

        float[] mylist = new float[5];

        for (int i = 1; i < mylist.length; i++) {
            mylist[i] = (float)Math.random()*10;
        }

        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }

        int maxIndex = 0;
        float maxValue = mylist[0];
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] >= maxValue) {
                maxValue = mylist[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("\nLargest element in the array: " + maxValue);
        System.out.println("\nSmallest index of the largest element: " + maxIndex);
    }
}