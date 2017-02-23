package topic2_expressions_statements_codeblocks_methods;

public class Lesson04_MethodsInJava {
	
	public static void main(String[] args) {
		
		/**
		 * Here we just have a simple program that is a 
		 * game which calculates our finalScore after 
		 * our game is over.
		 */
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver){
			/**
			 * Notice the variable int finalScore. It will only
			 * exist in the scope of this code block. This is why it 
			 * can be declared again as in the other `if` conditional
			 * check below.
			 */
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was: " + finalScore);
		}
		
		/**
		 * Suppose we have another player and their finalScore
		 * is to be counted. That would mean that the previous values would
		 * be overridden since we would have to re-iterate(repeat)
		 * the same process with the `if` condition check as below:
		 */
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if(gameOver){
			//variable: int finalScore only exists in scope of this code block
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was: " + finalScore);
		}
		
		/**
		 * Although we needed to duplicate our code, the drawback
		 * is that we need to maintain our duplicate(s) every time we make
		 * a change to the original code. For example if there was a new 
		 * attribute calculation to be added in the first `if` conditional
		 * check, we would need to apply it in the second `if` conditional
		 * check. e.g. our finalScore in the first `if` conditional check 
		 * is then added with a 1000: finalScore += 1000;
		 * Yet in the second `if` conditional check it's not added. So 
		 * the developer would need to remember to do these sort of changes
		 * every time. suppose we have 50, or 100 of the same `if` checks?
		 * You see the problem??.....
		 */
	}
	
	/**
	 * This is where Methods come in! We have been using Methods all along
	 * This comment you are reading is outside a method called:
	 * 
	 * public static void main(String[] args){
	 * 		With a bunch of statements here....
	 * }
	 * 
	 * Simple Rule about creation of methods include:
	 * - must be inside a class.
	 * 
	 * The keywords `public`, `static`, `void` will be explained in later tuts.
	 */
	public static void calculateScore(){
		
		/**
		 * This method can be called in the `main` method as calculateScore()
		 * The purpose of Methods is to eliminate repetition in code blocks
		 * and allow you to pass information without the need of hard coding
		 * values all the time. 
		 */
		
	}

}

class MethodPassing{
	
	/**
	 * Following our Class {@link Lesson04_MethodsInJava}
	 * We would want to use our method to perform 
	 * the calculation of the finalScore.  
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * 1) 
		 * 
		 * Firstly, we wouldn't need to perform the check here.
		 * So we would want our method `calculateScore()` handle that
		 * Secondly, we will want our method to somehow take the values
		 * of our variables and calculate them. To achieve this we will
		 * do what is called `passing` values or variables. 
		 * 
		 * Currently our method is defined as:
		 * 
		 * calculateScore();
		 * 
		 * the empty brackets symbolize that there will be no values or variables
		 * that will be passed in which are named as parameters.
		 * 
		 * So we would want our method to have method parameters that include:
		 * 
		 * gameOver
		 * score
		 * levelCompleted
		 * bonus
		 * 
		 */
		
		/**
		 * 3) 
		 * 
		 * To call our `calculateScore()` method we would call it as below:
		 */
		calculateScore(true, 800, 5, 100);
		
		/**
		 * For our second player, we would just need to pass in the values in the
		 * calculateScore() method and it should also work as expected and this time,
		 * it should return the correct amount since the method we are now calling has
		 * the `finalScore` being added with a 1000.
		 */
		calculateScore(true, 10000, 8, 200);
		
	}
	
	/**
	 * 2) 
	 * 
	 * Method will allow you to create parameters as below
	 */
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was: " + finalScore);
		}
		
	}

	
}

class MethodReturn{
	
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