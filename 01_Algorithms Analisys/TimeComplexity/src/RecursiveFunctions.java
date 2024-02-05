import java.util.Scanner;

public class RecursiveFunctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of iterations for the loops");
        int n = sc.nextInt();
        sc.close();
        // Factorial
        long start = System.currentTimeMillis();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");// Print the time
        // Hexadecimal
        start = System.currentTimeMillis();
        System.out.print("Hexadecimal of " + n + " is: ");
        printInt(n, 16);
        System.out.println();
        end = System.currentTimeMillis();
    }

    /**
     * @param n number to calculate the factorial
     * @return factorial number: n! with recursion
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * @param n number to calculate its hex representation with recursion
     */
    public static void printInt(int number, int base) {
        String conversion = "0123456789ABCDEF";
        char digit = (char) (number % base);
        number = number / base;
        if (number != 0) {
            printInt(number, base);
        }
        System.out.print(conversion.charAt(digit));
    }
/**
 * 
 * @param n
 * @param from_rod
 * @param to_rod
 * @param aux_rod
 */
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {

    }
    /**
     * 
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}