package topic2_expressions_statements_codeblocks_methods;

public class Lesson01_KeywordsAndExpressions {
	
	public static void main(String[] args) {
		
	/**
	 * An expression is a construct made up of variables, 
	 * operators, and method invocations, which are constructed 
	 * according to the syntax of the language, that evaluates 
	 * to a single value.
	 */
		
		int cadence = 0;
		int[] anArray = {};
		anArray[0] = 100;
		System.out.println("Element 1 at index 0: " + anArray[0]);

		int result = 1 + 2; // result is now 3
		int value1 = 10;
		int value2 = 10;
		
		if (value1 == value2) 
		    System.out.println("value1 == value2");
		
	 /** 
	 * The data type of the value returned by an expression 
	 * depends on the elements used in the expression. 
	 * The expression cadence = 0 returns an int because the 
	 * assignment operator returns a value of the same data 
	 * type as its left-hand operand; in this case, cadence 
	 * is an int. As you can see from the other expressions, 
	 * an expression can return other types of values as well, 
	 * such as boolean or String.
	 * 
	 * The Java programming language allows you to construct 
	 * compound expressions from various smaller expressions 
	 * as long as the data type required by one part of the expression 
	 * matches the data type of the other. Here's an example of a 
	 * compound expression:
	 * 
	 */
		value1 = 1 * 2 * 3;
	 /** 
	 * In this particular example, the order in which the expression 
	 * is evaluated is unimportant because the result of multiplication 
	 * is independent of order; the outcome is always the same, 
	 * no matter in which order you apply the multiplications. 
	 * However, this is not true of all expressions. 
	 * For example, the following expression gives different results, 
	 * depending on whether you perform the addition or the division 
	 * operation first:
	 */
		int x = 0;
		int y = 10;
		
		x = x + y / 100;    // ambiguous
	 /** 
	 * You can specify exactly how an expression will be evaluated using 
	 * balanced parenthesis: ( and ). For example, to make the previous 
	 * expression unambiguous, you could write the following:
	 * 
	 */
		x = (x + y) / 100;  // unambiguous, recommended
		
		
		
	}

}
