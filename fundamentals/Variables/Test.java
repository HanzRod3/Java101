package Variables;

public class Test {
    public static void main(String[] args) {
        int count; // Declaration
        count = 5; // Assignment

        double pi = 3.14159265; // Declaration and assignment

        boolean isCorrect = true;
        char grade = 'A';

        String message = "Hello!";
    }
}
/*
 * Understanding Variables in Java
 * 
 * Type Declaration:
 * 
 * Every variable needs a type declaration when we first use it. This tells Java
 * what kind of data the variable will hold.
 * Example: int count;
 * Assigning Values:
 * 
 * After declaring a variable, we can assign it a value using = symbol.
 * Example: count = 5;
 * Default Values if Uninitialized:
 * 
 * If we declare a variable but don't give it a value, Java assigns default
 * values based on the type:
 * int: 0
 * double: 0.0
 * boolean: false
 * String: null
 * Naming Conventions:
 * 
 * Choose meaningful names for variables. Avoid using single letters or
 * confusing names.
 * Start with a lowercase letter and use camel case for multiple words.
 * Example: totalAmount, isCorrect
 * Primitive Types:
 * 
 * Basic data types in Java include int, long, boolean, double, char.
 * They hold simple values like numbers or characters.
 * Object Types & "Wrapper Classes":
 * 
 * Java also has object types like Integer, Long, Boolean, Double, Character.
 * These are more complex versions of primitive types and offer additional
 * functionality.
 */