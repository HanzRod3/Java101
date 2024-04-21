import java.util.Scanner; // Import the Scanner class
// must match file name 

public class Test {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter some input
        System.out.println("Please enter your name:");

        // Step 3: Read the input provided by the user
        String name = scanner.nextLine();

        // Step 4: Display the input back to the user
        System.out.println("Hello, " + name + "!");

        // Step 5: Close the scanner to release system resources
        scanner.close();
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1: Create a Scanner object to read input from the console

        System.out.println("Enter your name: "); // Step 2: Prompt the user to enter their name
        String name = sc.nextLine(); // Step 3: Read the input provided by the user as a String

        System.out.println("Enter your age: "); // Step 4: Prompt the user to enter their age
        int age = sc.nextInt(); // Step 5: Read the input provided by the user as an integer

        System.out.println("Welcome: " + name); // Step 6: Display the user's name
        System.out.println("Age: " + age); // Step 7: Display the user's age

        sc.close(); // Step 8: Close the Scanner to release system resources
    }
}
