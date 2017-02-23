package topic3_control_flow_statements;

public class Lesson02_ForLoop {
	
	public static void main(String[] args) {
		
		/**
		 * The for statement provides a compact way to iterate over 
		 * a range of values. Programmers often refer to it as the 
		 * "for loop" because of the way in which it repeatedly loops 
		 * until a particular condition is satisfied. The general 
		 * form of the for statement can be expressed as follows:
		 * 
		 * for (initialization; termination; increment) {
		 * 		statement(s)
		 * }
		 * 
		 * When using this version of the for statement, keep in mind that:
		 * 
		 * The initialization expression initializes the loop; it's 
		 * executed once, as the loop begins.
		 * 
		 * When the termination expression evaluates to false, the 
		 * loop terminates.
		 * 
		 * The increment expression is invoked after each iteration 
		 * through the loop; it is perfectly acceptable for this 
		 * expression to increment or decrement a value.
		 */
		for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
       }
		
		/**
		 * Notice how the code declares a variable within the initialization 
		 * expression. The scope of this variable extends from its declaration 
		 * to the end of the block governed by the for statement, so it can 
		 * be used in the termination and increment expressions as well. If 
		 * the variable that controls a for statement is not needed outside 
		 * of the loop, it's best to declare the variable in the initialization 
		 * expression. The names i, j, and k are often used to control for 
		 * loops; declaring them within the initialization expression limits 
		 * their life span and reduces errors.
		 * 
		 * The three expressions of the for loop are optional; an infinite 
		 * loop can be created as follows:
		 */
		
		// infinite loop
		for ( ; ; ) {
		    
		    // your code goes here
			//make sure you stop me.... otherwise I'll run FOREVERRrrrrrrr......
		}
	}

}

/**
 * The for statement also has another form designed for iteration through 
 * Collections and arrays This form is sometimes referred to as the 
 * enhanced for statement, and can be used to make your loops more compact 
 * and easy to read. To demonstrate, consider the following array, 
 * which holds the numbers 1 through 10:
 */
class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
}
