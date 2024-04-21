public class Test {

    public static void main(String[] args) {

        // Length: Determine the length of the string
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println("String Length is: " + length); // Outputs: String Length is: 23

        // Concatenate: Joining two strings together
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3); // Outputs: My name is Michael

        // Format: Concatenating strings with placeholders
        String ninjaFormatted = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninjaFormatted); // Outputs: Hi Jack, you owe me $25.00 !
        // %s expects a string, %.2f expects a float with two decimal points

        // IndexOf: Find the index of a substring within a string
        String ninjaIndex = "Welcome to Coding Dojo!";
        int a = ninjaIndex.indexOf("Coding"); // a is 11
        int b = ninjaIndex.indexOf("co"); // b is 3
        int c = ninjaIndex.indexOf("pizza"); // c is -1, "pizza" is not found

        // Trim: Remove leading and trailing whitespace
        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim()); // Outputs: spaces everywhere!

        // Uppercase and Lowercase: Convert strings to uppercase or lowercase
        String upperCaseString = "HELLO";
        String lowerCaseString = "world";
        System.out.println(upperCaseString.toLowerCase()); // Outputs: hello
        System.out.println(lowerCaseString.toUpperCase()); // Outputs: WORLD

        // Equality: Compare strings for equality using == and .equals()
        String str1 = "same string";
        String str2 = "same string";
        System.out.println(str1 == str2); // Outputs: true (since both strings are interned)
        // Using new String objects, which are not interned
        str1 = new String("same letters");
        str2 = new String("same letters");
        System.out.println(str1 == str2); // Outputs: false (since they are different objects in memory)
        System.out.println(str1.equals(str2)); // Outputs: true (since they have the same exact characters)
    }
} 