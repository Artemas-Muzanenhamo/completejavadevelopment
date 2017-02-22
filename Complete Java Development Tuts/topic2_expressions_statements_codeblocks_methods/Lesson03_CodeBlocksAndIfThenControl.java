package topic2_expressions_statements_codeblocks_methods;

public class Lesson03_CodeBlocksAndIfThenControl {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score == 5000)
			System.out.println("Your score was 5000");
		/**
		 * A block is a group of zero or more statements 
		 * between balanced braces and can be used anywhere 
		 * a single statement is allowed. The following 
		 * example, BlockDemo, illustrates the use of blocks:
		 */
		boolean condition = true;
        if (condition) { // begin block 1
        	int myInt = 10;
             System.out.println("Condition is true.");
        } // end block one
        else { // begin block 2
             System.out.println("Condition is false.");
        } // end block 2
        
	}
	
	/**
     * The `if ... else` statements are control flow statements.
     * 
     * The statements inside your source files are generally executed 
     * from top to bottom, in the order that they appear. 
     * Control flow statements, however, break up the flow of execution 
     * by employing decision making, looping, and branching, 
     * enabling your program to conditionally execute particular blocks of code. 
     * This section describes the decision-making statements (if-then, if-then-else, switch), 
     * the looping statements (for, while, do-while), and the branching statements 
     * (break, continue, return) supported by the Java programming language.
     */
	
	/**
     * The if-then Statement
     * 
     * The if-then statement is the most basic of all the control flow statements. 
     * It tells your program to execute a certain section of code only if a particular 
     * test evaluates to true. For example, the Bicycle class could allow the brakes to 
     * decrease the bicycle's speed only if the bicycle is already in motion. One possible 
     * implementation of the applyBrakes method could be as follows:
     */
    void applyBrakes() {
        // the "if" clause: bicycle must be moving
        if (isMoving){ 
            // the "then" clause: decrease current speed
            currentSpeed--;
        }
    }
    
    /**
     * If this test evaluates to false (meaning that the bicycle is not in motion), 
     * control jumps to the end of the if-then statement.
     * 
     * In addition, the opening and closing braces are optional, provided that 
     * the "then" clause contains only one statement:
     */
    void applyBrakes() {
        // same as above, but without braces 
        if (isMoving)
            currentSpeed--;
    }
    
    /**
     * Deciding when to omit the braces is a matter of personal taste. 
     * Omitting them can make the code more brittle. If a second statement is later 
     * added to the "then" clause, a common mistake would be forgetting to add the 
     * newly required braces. The compiler cannot catch this sort of error; you'll 
     * just get the wrong results.
     */
    
    /**
     * The if-then-else Statement
     * 
     * The if-then-else statement provides a secondary path of execution when an "if" 
     * clause evaluates to false. You could use an if-then-else statement in the 
     * applyBrakes method to take some action if the brakes are applied when the 
     * bicycle is not in motion. In this case, the action is to simply print an error 
     * message stating that the bicycle has already stopped.
     */
    void applyBrakes() {
        if (isMoving) {
            currentSpeed--;
        } else {
            System.err.println("The bicycle has already stopped!");
        } 
    }
}

/**
 * The following program, IfElseDemo, assigns a grade based on the value of a test score: 
 * an A for a score of 90% or above, a B for a score of 80% or above, and so on.
 */
class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}

/**
 * The output from the program is:
 * 		Grade = C
 * You may have noticed that the value of testscore can satisfy more than one expression in the 
 * compound statement: 76 >= 70 and 76 >= 60. However, once a condition is satisfied, the appropriate 
 * statements are executed (grade = 'C';) and the remaining conditions are not evaluated.
 */
