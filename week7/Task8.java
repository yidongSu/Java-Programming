public class Task8 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are\n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0; 
        int number = 2; 

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.printf("%-5d\n", number);
            }
            else
                System.out.printf("%-5d", number);
            }
            
            number++;
        }
    }

    private static boolean isPrime(int num) {
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
            return false;
        }
    }
        return true;
    }
}
