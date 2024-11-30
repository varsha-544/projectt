public class primenumber {

    public static void main(String[] args) {
        // Input numbers to check for primality
        int[] numbersToCheck = {2, 3, 4, 5, 10, 17, 18, 19, 20};

        // Loop through the numbers and check if they are prime
        for (int number : numbersToCheck) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible by any number
            }
        }
        return true; // Prime if no divisors found
    }
}
