package topic2_expressions_statements_codeblocks_methods;

public class Lesson02_Statements_Whitespaces_Indentation {

	public static void main(String[] args) {
		
		/**
		 * Statement - Statements are roughly equivalent to sentences 
		 * in natural languages. A statement forms a complete unit of 
		 * execution. The following types of expressions can be made 
		 * into a statement by terminating the expression with a semicolon (;).
		 * 
		 * - Assignment expressions
		 * - Any use of ++ or --
		 * - Method invocations
		 * - Object creation expressions
		 * 
		 * Such statements are called expression statements. 
		 * Here are some examples of expression statements.
		 */
		
		// assignment statement
		aValue = 8933.234;
		
		// increment statement
		aValue++;
		
		// method invocation statement
		System.out.println("Hello World!");
		
		// object creation statement
		Bicycle myBike = new Bicycle();
		
		/**
		 * In addition to expression statements, there are two other kinds of statements: 
		 * declaration statements and control flow statements. 
		 * A declaration statement declares a variable. 
		 * You've seen many examples of declaration statements already:
		 */
		// declaration statement
		double aValue = 8933.234;
		
		/**
		 * Finally, control flow statements regulate the order in which statements get executed.
		 */
		
	}

}
