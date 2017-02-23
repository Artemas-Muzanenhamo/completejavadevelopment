package topic3_control_flow_statements;

/**
 * The while statement continually executes a block of 
 * statements while a particular condition is true. Its syntax can be expressed as:
 * 
 * while (expression) {
 * 		statement(s)
 * }
 *
 */
public class Lesson03_WhileDoWhile {
	
	public static void main(String[] args) {
		
		/**
		 * The while statement evaluates expression, which must return a boolean value. 
		 * If the expression evaluates to true, the while statement executes the statement(s) 
		 * in the while block. The while statement continues testing the expression and 
		 * executing its block until the expression evaluates to false. Using the while 
		 * statement to print the values from 1 through 10 can be accomplished as in the 
		 * following Lesson03_WhileDoWhile program:
		 */
		int count = 1;
	    while (count < 11) {
	        System.out.println("Count is: " + count);
	        count++;
	    }
	    
	    /**
	     * You can implement an infinite loop using the while statement as follows:
	     * while (true){
	     * 		// your code goes here
	     * }
	     */
	}
}

/**
 * The Java programming language also provides a do-while statement, which can be expressed 
 * as follows:
 * 
 * do {
 * 		statement(s)
 * } while (expression);
 */
class doWhile{
	
	public static void main(String[] args) {
		
		
		/**
		 * The difference between do-while and while is that do-while evaluates its 
		 * expression at the bottom of the loop instead of the top.
		 */
		int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
	}
	
}
