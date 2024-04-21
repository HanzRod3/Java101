
public class Test {
    public static void main(String[] args) {
        // Declare and initialize variables 'x' and 'y'
        int x = 9;
        int y = 5;

        // Call the add method with arguments 'x' and 'y' and store the result in
        // variable 'z'
        int z = add(x, y);

        // Print the value of 'z'
        System.out.println(z);
    }

    // Define a method named 'add' that takes two integer parameters 'x' and 'y'
    static int add(int x, int y) {
        // Add 'x' and 'y' and store the result in variable 'z'
        int z = x + y;
        // Return the result of the addition
        return z;
    }
}
