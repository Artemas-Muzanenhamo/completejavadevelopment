package topic1_variable_datatypes_operators;

public class Lesson06Recap {
	
	public static void main(String[] args) {
		
//		byte
//		short
//		int
//		long
//		float
//		double
//		char
//		boolean
		
		/**
		 * These data types are known as Primitive Data Types in Java. 
		 * Each primitive is used for it's own purpose and style.
		 * Each primitive has it's own allocation in memory.
		 * 
		 * There's also a special kind of literal called a class literal, 
		 * formed by taking a type name and appending ".class"; 
		 * for example, String.class. This refers to the 
		 * object (of type Class) that represents the type itself.
		 * 
		 * Unlike the `char` we use the double quotes and the String
		 * data type can handle multiple characters unlike the `char`
		 * data type which stores one character.
		 */
		
		String myString = "This is a string";
		System.out.println("myString is equal to: " + myString);
		
		//We can also append Strings as below using the `+` operator:
		myString = myString + " which has been appended.";
		System.out.println(myString);
		//We can also append Strings with unicode as well as below:
		myString = myString + "\u00A9 2015";
		System.out.println(myString);
		
		/**
		 * So in the case of using numbers with the String data type,
		 * if we appended a String with a number value and added some 
		 * numbers to the same string by using the `+` operator, the question 
		 * would be, will it be added automatically?
		 * 
		 */
		
		String numberString = "46.78";
		numberString = numberString + "43";
		System.out.println("numberString will return: "+ numberString);
		
		/**
		 * Similarly when we append an `int` with a String. Since the 
		 * String is on the left side of the statement, the `int` value 
		 * will be appended in the String and is treated purely as
		 * text. 
		 */
		
		String lastString = "10";
		int myInt = 50;
		
		lastString = lastString + myInt;
		System.out.println("lastString appended with a number returns: " + lastString);
		
		/**
		 * The same rule applies even when we append a `double` value to a String.
		 */
		lastString = lastString + 123.43;
		System.out.println(lastString);
		
		/**
		 * With a string the number is only appended and treated as text when we assign
		 * values to a String data type.
		 */
		
		/**
		 * The Java programming language uses both "fields" and "variables" 
		 * as part of its terminology. Instance variables (non-static fields) 
		 * are unique to each instance of a class. Class variables (static fields) 
		 * are fields declared with the static modifier; there is exactly one copy 
		 * of a class variable, regardless of how many times the class has been instantiated. 
		 * Local variables store temporary state inside a method. 
		 * Parameters are variables that provide extra information to a method; 
		 * both local variables and parameters are always classified as "variables" (not "fields"). 
		 * When naming your fields or variables, there are rules and conventions 
		 * that you should (or must) follow.
		 * 
		 * The eight primitive data types are: byte, short, int, long, 
		 * float, double, boolean, and char. 
		 * The java.lang.String class represents character strings. 
		 * The compiler will assign a reasonable default value for 
		 * fields of the above types; for local variables, a default 
		 * value is never assigned. A literal is the source code 
		 * representation of a fixed value. An array is a container 
		 * object that holds a fixed number of values of a single type. 
		 * The length of an array is established when the array is created. 
		 * After creation, its length is fixed.
		 */
		
	}

}
