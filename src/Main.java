/**
 * Alondra - Reyes Pagan
 * CEN 4802 - Software Integration, Configuration, and Testing
 * Assignment 1
 * 17 January 2026
 */
//The extra code displayed here was just me exploring
public class Main {
    /**
     * Main Method. Calls Fibonacci Method.
     * @param args - Is an Array of String containing variables
     */

    //private static long[] fibonacciCache;
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println("The " + n + " th term of the fibonacci sequence is " + fibonacci(n));
        //fibonacciCache = new long[n + 1];
        //This is so it prints the sequence not just the 10th number, and to do that we need a for loop
        //for (int i = 0; i <= n; i++) {
        //System.out.print(fibonacci(n));
        //System.out.println (fibonacci(i) + " ");
        //System.out.println("The term of the fibonacci sequence is y = " + fibonacci(i));
    }
    /* The method long is used to calculate the fibonacci number; but long has a limit which is 9 quintillion and work
    until the 92nd fibonacci number, so for this case it works since we only need to find the 10th
     */
    //private static long fibonacci(int n) {

    /**
     * Is performing the Fibonacci Sequence, given the variable of n.
     * @param n - Number nth of the sequence, and the method is trying to find the number of it.
     * @return - Number in the nth position is defined because of its parameter.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
        /* This method is called the Memoization, which basically lets you not have to recalculate numbers already used
        so the program will run faster than when I had not coded it
         */
        /*
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
         */
    }
}


