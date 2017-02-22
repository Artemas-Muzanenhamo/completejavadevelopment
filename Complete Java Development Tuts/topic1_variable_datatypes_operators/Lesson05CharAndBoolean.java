package topic1_variable_datatypes_operators;

public class Lesson05CharAndBoolean {
	
	public static void main(String[] args) {
		
		/**
		 * char - The char data type is a single 16-bit Unicode character. 
		 * It has a minimum value of '\u0000' (or 0) and a maximum value 
		 * of '\uffff' (or 65,535 inclusive).
		 * 
		 * It can only take one character literal so:
		 * 		char myChar = 'As';
		 * would be illegal while:
		 * 		char myChar = 'A';
		 * would be allowed.
		 * 
		 * @link{https://unicode-table.com/en}
		 * 
		 * We are however allowed to assign unicode as a 
		 * `char` literal as below:
		 */
		
		char myChar = '\u00A9';
		
		System.out.println("unicode output as: " + myChar);
		
		
		/**
		 * boolean - The boolean data type has only two possible values: 
		 * true and false. Use this data type for simple flags that track 
		 * true/false conditions. This data type represents one bit of 
		 * information, but its "size" isn't something that's precisely defined.
		 * 
		 * There are only two values with the boolean data type.
		 * - True
		 * - False
		 * 
		 * Used a lot for conditional logic
		 * 
		 * In the naming convention standard for booleans, we tend to use the formality:
		 * 
		 * [datatype] [variable name as a question] = [datatype value]
		 * 
		 * boolean isMale = true;
		 */
		
		boolean myBoolean = true;
		
	}

}
