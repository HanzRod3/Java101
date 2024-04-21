package SwtichTernary;

public class Test {

    // Switch Statements in Java

    // A switch statement tests a variable for equality against a list of values.
int day = 2;

    // Start with the switch keyword and pass in the variable we are checking.
    switch(day){
    // Specify what to do for each possible case.
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    // The default case can be used for performing a task when none of the cases is matched.
    default:
        System.out.println("There are only seven days in a week...");

    // Be sure to include the break keyword after each case to exit the switch
    // block.

    // Ternary Operators in Java

    // Ternary operators allow us to write more concise code for simple conditional
    // expressions.

    // Weather example using if-else statement:
    boolean isRaining = true;

    if(isRaining)
    {
        System.out.println("Bring an umbrella.");
    }else
    {
        System.out.println("Have fun!");
    }

    // Same code using a ternary operator:
    System.out.println(isRaining?"Bring an umbrella":"Have fun!");

    // Ternary operator syntax: condition ? valueIfTrue : valueIfFalse
    }
}