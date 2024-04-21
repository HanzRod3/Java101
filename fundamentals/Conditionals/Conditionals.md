
`If Statements
What if we have some code that we only want to execute under certain conditions? In computer programming, this is called a conditional statement. The syntax in Java looks like this:`


        if (condition) {
            // what to do if condition is true
        }

            // continue with program

        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Bring an umbrella.");
        }

`If-Else Chains`
`Likewise, we can chain multiple conditions in an if-else chain:`

        if(condition) {
            // what to do if condition is true
        }
        else if(2nd condition) {
            // what to do if 2nd condition is true
        }
        // ... can have 0 to many else -if statements...
        else {
            // what to do if none of the previous conditions are met
        } // can have 1 or no else statement

`If / Else Statements`

        boolean isRaining = true
        if(isRaining) {
            System.out.println("Bring and umbrella.");
        }
        else {
            System.out.println("Have fun!");
        }

`If / Else if / Else Statements`

boolean isRaining = true;
boolean isCold = true;

if(isRaining) {
    System.out.println("Bring an umbrella.");
}
else if(isCold) {
    System.out.println("Wear a coat.");
}
else {
    System.out.println("Have fun!);
}

` A few things to remember: `

- A condition must always evaluate to a `boolean` value, `true` or `false`
- If the condition is true, it will execute the block of code between the curly braces `{...}`, then skip any other `else if` or `else` statements in that chain and keep going. 
- If the condition is false, it will skip that block of code `{...}` but continue to the code immediately following that block which may be another `else if` or `else` statement.

` Assignment Operator vs Comparison Operators`
As a programmer, you will often mistakenly type a `-` whre you meant to type a `==`, but don't feel bad, seasoned developers do this form time to time they just get faster and faster at catching it when things break. Let's revview the assignment operator, `=` or what you might call the `SET AS` operator vs. all the comparison operators.



-------------------------------------------------------------------------------------
    =           assignment operator

    ==          equal                               int count=1;// assigns a value
                                                    count ==1;//evaluates to true
                                                    count ==2;//evaluates to false

    !=          not equal                           count!=2;//true
                                                    count!=1;//false

    >           greater than                        count>2;//false
                                                    count>0;//true

    <           less than                           count>=2;//true
                                                    count>=1;//false

    >=          greater than or equal to            count>=2;//false;
                                                    count>=1;//true

    <=          less than or equal to               count<=2;//true;
                                                    count<=1;//true
-------------------------------------------------------------------------------------
`Logical Operators`
    
    
    &&          AND - both conditions must be true to be true



            Example:         int age = 45;

                    age<65 && age > 17;
                    // evaluates to true
                    // (Would pay adult price)

                    age <110 && age > 65;
                    // false
                    // (Is not a senior, nor immortal)


    ||          OR - One of the conditions must be true


    

    !           NOT

            Example:
                    Int age = 16;
                    !(age < 16)
                    // true
                    // (May obtain a drivers license)

