public class WhileLoopExample {
    public static void main(String[] args) {
        // Condition Evaluation: At the beginning of each iteration, the condition
        // inside the parentheses () is evaluated. If the condition is true, the code
        // block inside the loop is executed. If the condition is false, the loop
        // terminates, and the program continues execution after the loop.
        int i = 1;

        // Define the while loop condition
        while (i <= 5) {
            /*
             * Code Execution: If the condition is true, the statements inside the curly
             * braces {} following the while statement are executed. These statements can be
             * a single statement or a block of multiple statements
             */

            // Print the current value of 'i'
            System.out.println("Value of i: " + i);

            /*
             * Within the loop body, it's common to have statements that change the
             * variables involved in the condition. If these changes eventually lead to the
             * condition becoming false, the loop will terminate.
             */
            i++;
        }

        /*
         * Loop Termination: The loop continues to execute as long as the condition
         * remains true. Once the condition becomes false, the loop terminates, and the
         * program control moves to the next statement after the loop.
         */
        System.out.println("Loop has ended.");
    }
}
