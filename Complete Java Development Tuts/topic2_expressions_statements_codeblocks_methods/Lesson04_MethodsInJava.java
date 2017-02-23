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
