`Switch Statements and Ternary Operators`

    We briefly mention Switch Statements in the 'Conditionals & Operators'  lesson.

    Let's have a look at a Switch Statement to see how it can be used to control the flow of our program.


    int day = 2;
    switch(day){
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
        default:
                System.out.println("There are only seven days in a week...");
    }
---------------------------------------------------------------------------
We can see that the `setup` is very different from If Statements.
We start with the switch keyword and pass in the variable we are checking.
Inside of the switch statement, we specify what we want to happen for each possible case. Using the example above, we can see that we print out the day of the week based on the value of our `day` variable.

Be sure to include the `break` keyword after each case. This will ensure that our program gets out of the switch block once the desired value has been found. Including a `default` keyword at the bottom of our switch statement is equivalent to the `else` keyword in an if statement. We do not need a `break` keyword after `default` as it is the last option in our switch block.

`Ternary Operators`

Let us also have a quick look at ternary operators. Ternary operators allow us to write more concise code. We will use the weather example from our previous lesson.

    boolean isRaining = true;
            
    if(isRaining) {
            System.out.println("Bring an umbrella.");
    }
    else {
        System.out.println("Have fun!");
    }

Here is the same code using a ternary operator:

    System.out.println(isRaining ? "Bring an umbrella" : "Have fun!");

The ternary operator consists of three pieces; the condition, the return value if the condition is true, and the return value if the condition is false.