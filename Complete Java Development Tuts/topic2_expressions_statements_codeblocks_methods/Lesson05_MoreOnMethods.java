package topic2_expressions_statements_codeblocks_methods;

public class Lesson05_MoreOnMethods {
	
	/**
	 * Following our Class {@link MethodPassing}
	 * We would want to use our method to perform 
	 * the calculation of the finalScore AND then
	 * return the value back to our code in the 
	 * `main` method.  
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		calculateScore(true, 800, 5, 100);
		
		calculateScore(true, 10000, 8, 200);
		
	}
	
	/**
	 * 1) 
	 * 
	 * If we wanted our method to return value back into our main method
	 * we would need to change what is called the `method return type`.
	 * The keyword `void` in our method for calculateScore() is a method
	 * return type which basically means that nothing (void) will be returned.
	 * Method return types can be nothing or can return values back of a 
	 * specified data type. So our primitive data types can be valid return
	 * types for our method. 
	 * 
	 * @param gameOver
	 * @param score
	 * @param levelCompleted
	 * @param bonus
	 */
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was: " + finalScore);
			return finalScore;
		}
		
		return -1;
		
	}
}
