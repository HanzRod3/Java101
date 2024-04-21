package Overload;
/*
Overloaded methods in Java allow multiple methods with the same name but different parameter lists. They provide flexibility by enabling methods to perform similar tasks with varying input types or numbers. Overloading enhances code readability and reusability, as methods can accommodate different data types or parameters while maintaining a consistent interface.
 */

public class Test {

    // Method 1: add method that takes two integers and returns their sum
    static int add(int x, int y) {
        return x + y;
    }

    // Method 2: overloaded add method that takes three integers and returns their
    // sum
    static int add(int x, int y, int z) {
        return x + y + z;
    }

    // Method 3: overloaded add method that takes two doubles and returns their sum
    static double add(double x, double y) {
        return x + y;
    }

    // Method 4: overloaded add method that takes an array of integers and returns
    // their sum
    static int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test Method 1
        int sum1 = add(5, 3);
        System.out.println("Sum of two integers: " + sum1); // Output: Sum of two integers: 8

        // Test Method 2
        int sum2 = add(5, 3, 2);
        System.out.println("Sum of three integers: " + sum2); // Output: Sum of three integers: 10

        // Test Method 3
        double sum3 = add(2.5, 3.7);
        System.out.println("Sum of two doubles: " + sum3); // Output: Sum of two doubles: 6.2

        // Test Method 4
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum4 = add(numbers);
        System.out.println("Sum of array elements: " + sum4); // Output: Sum of array elements: 15
    }
}
