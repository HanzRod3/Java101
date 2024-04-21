/*
Array Basics:
Arrays in Java are fixed-size sequential collections of elements of the same type with a zero-based index.
They are initialized with a fixed size, and elements can be accessed using index notation.

Fixed Size:
Arrays have a fixed size after initialization, meaning you cannot add or remove elements once defined.
*/

// Declaration and initialization of an integer array with size 5
int[] myArray = new int[5];

// Adding elements to the array
myArray[0] = 4;
myArray[1] = 8;
myArray[2] = 8;
myArray[3] = 5;
myArray[4] = 9;

// Alternatively, declaration, initialization, and adding in one step
int[] myArray = {4, 8, 8, 5, 9};

// Declaration of a string array with size 5
String[] fruits = new String[5];
/*Declaration and Initialization:
Arrays can be declared and initialized separately or in a single step using curly braces for initialization. */

// Manipulating the string array
fruits[0] = "banana";
fruits[1] = "pear";
fruits[2] = "papaya";
fruits[3] = "kiwi";

// Swapping values in the string array
String temp = fruits[0];
fruits[0] = fruits[3];
fruits[3] = temp;

/*Manipulating Arrays:
Elements in an array can be manipulated by accessing them using index notation.
Operations like swapping elements can be performed by temporary variable assignment. */

// Getting the length of the array
System.out.println(fruits.length); // Output: 4

/* Array Length:
The length of an array can be obtained using the .length property.
Accessing the last element can be done using array[array.length - 1].
*/
// Accessing elements of the array
System.out.println(fruits[fruits.length - 1]); // Output: "banana"

// Printing the entire array using a for loop
for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}
/*
Printing Arrays:
The default string representation of an array isn't very helpful; it displays the array type and memory address.
To print all elements, you need to use a loop.
Alternatively, the ArrayList type offers more flexibility and functionality compared to basic arrays. */
