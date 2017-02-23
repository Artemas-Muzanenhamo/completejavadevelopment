package topic2_expressions_statements_codeblocks_methods;

/**
 * The Java programming language supports overloading methods, 
 * and Java can distinguish between methods with different 
 * method signatures. This means that methods within a class 
 * can have the same name if they have different parameter 
 * lists (there are some qualifications to this that will 
 * be discussed in the lesson titled "Interfaces and Inheritance").
 *
 */
public class Lesson06_MethodOverloading {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Suppose that you have a class that can use calligraphy to 
	 * draw various types of data (strings, integers, and so on) 
	 * and that contains a method for drawing each data type. 
	 * It is cumbersome to use a new name for each method—for example, 
	 * drawString, drawInteger, drawFloat, and so on. In the 
	 * Java programming language, you can use the same name for 
	 * all the drawing methods but pass a different argument 
	 * list to each method. Thus, the data drawing class might 
	 * declare four methods named draw, each of which has a 
	 * different parameter list.
	 * @param s
	 */
	public void draw(String s) {
        
    }
    public void draw(int i) {
        
    }
    public void draw(double f) {
        
    }
    public void draw(int i, double f) {
        
    }
    
    /**
     * Overloaded methods are differentiated by the number and the 
     * type of the arguments passed into the method. In the code 
     * sample, draw(String s) and draw(int i) are distinct and 
     * unique methods because they require different argument types.
     */

}
