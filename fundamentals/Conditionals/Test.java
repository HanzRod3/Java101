package Conditionals;

public class Test {

  // Conditional Statements in Java

  // If Statements
  // Use if statements to execute code only if a certain condition is true.
  boolean isRaining = true;

  if(isRaining)
  {
    System.out.println("Bring an umbrella.");
  }

  // If-Else Chains
  // Chain multiple conditions using if, else if, and else for different outcomes.
  boolean isCold = true;

  if(isRaining)
  {
    System.out.println("Bring an umbrella.");
  }else if(isCold)
  {
    System.out.println("Wear a coat.");
  }else
  {
    System.out.println("Have fun!");
  }

  // Assignment vs. Comparison Operators
  // Use = for assignment and == for comparison.

  // Comparison Operators
  // Use these operators to compare values:
  // ==: Equal
  // !=: Not equal
  // >: Greater than
  // <: Less than
  // >=: Greater than or equal to
  // <=: Less than or equal to

  // Logical Operators
  // Use logical operators to combine conditions:
  // &&: AND
  // ||: OR
  // !: NOT

  // Example:

  int age = 45;

  // AND
  if(age<65&&age>17)
  {
    System.out.println("Adult price");
  }

  // OR
  if(age<10||age>65)
  {
    System.out.println("No cares about age!");
  }

  // NOT
  if(!(age<16))
  {
    System.out.println("May obtain a driver's license");
  }

  /*
   * The if statement is one of the most frequently used conditional statements.
   * 
   * If the if statement's condition is true, the block of code inside the if
   * statement is executed.
   * 
   * Any of the following comparison operators may be used to form the condition:
   * 
   * < less than
   * 
   * > greater than
   * 
   * != not equal to
   * 
   * == equal to
   * 
   * <= less than or equal to
   * 
   * >= greater than or equal to
   */
  /*
   * Nested if Statements
   * You can use one if-else statement inside another if or else statement.
   * 
   */
  int age = 25;if(age>0)
  {
    if (age > 16) {
      System.out.println("Welcome!");
    } else {
      System.out.println("Too Young");
    }
  }else
  {
    System.out.println("Error");
  }

  /*
   * 
   * else if Statements
   * Instead of using nested if-else statements, you can use the else if statement
   * to check multiple conditions.
   * 
   * For example:
   * 
   */
  int age = 25;

  if(age<=0)
  {
    System.out.println("Error");
  }else if(age<=16)
  {
    System.out.println("Too Young");
  }else if(age<100)
  {
    System.out.println("Welcome!");
  }else
  {
    System.out.println("Really?");
  }

}