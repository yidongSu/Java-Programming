public class Task4 {
    public static void main(String[] args) {
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2.5, 4.6));
        System.out.println(Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)));
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(-2.1));
        int randomNumberBetween0And9 = (int)(Math.random() * 10);
        System.out.println(randomNumberBetween0And9);
        int randomNumberBetween50And99 = 50 + (int)(Math.random() * 50);
        System.out.println(randomNumberBetween50And99);
        int a = 10;
        int b = 20;
        int randomNumberBetweenAAndABMinus1 = a + (int)(Math.random() * b);
        System.out.println(randomNumberBetweenAAndABMinus1);
    }
}