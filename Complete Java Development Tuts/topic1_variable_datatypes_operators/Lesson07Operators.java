package topic1_variable_datatypes_operators;

/**
 * Now that you've learned how to declare and initialize variables, 
 * you probably want to know how to do something with them. 
 * Learning the operators of the Java programming language is a good place to start. 
 * Operators are special symbols that perform specific operations 
 * on one, two, or three operands, and then return a result.
 * 
 * As we explore the operators of the Java programming language, 
 * it may be helpful for you to know ahead of time which operators 
 * have the highest precedence. The operators in the following 
 * table are listed according to precedence order. 
 * The closer to the top of the table an operator appears, the higher 
 * its precedence. Operators with higher precedence are evaluated before 
 * operators with relatively lower precedence. 
 * Operators on the same line have equal precedence. 
 * When operators of equal precedence appear in the same expression, a rule must govern 
 * which is evaluated first. All binary operators except for the assignment operators 
 * are evaluated from left to right; assignment operators are evaluated right to left.
 * 
 * Operators				Precedence
 * ==========				===========
	postfix					expr++ expr--
	unary					++expr --expr +expr -expr ~ !
	multiplicative			* / %
	additive				+ -
	shift					<< >> >>>
	relational				< > <= >= instanceof
	equality				== !=
	bitwise AND				&
	bitwise exclusive OR	^
	bitwise inclusive OR	|
	logical AND				&&
	logical OR				||
	ternary					? :
	assignment				= += -= *= /= %= &= ^= |= <<= >>= >>>=
 *
 */
public class Lesson07Operators {
	
	public static void main(String[] args) {
		
		/**
		 * The `additive` operator will allow us to 
		 * add numbers together IF we are using NUMBER
		 * data types. It can also be used for appending 
		 * or concatenation when we use String data types.
		 */
		int result = 1 + 2;
		//result is now 3
		System.out.println(result);
		
		int original_result = result;
		
		/**
		 * The subtraction operator will allow us to 
		 * subtract numbers from each other IF we are using
		 * NUMBER data types. This operand however is 
		 * undefined for the use with Strings or text.
		 */
		result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;
        
        /**
         * The multiplicative operator will allow us to 
         * multiply values which are NUMBER data types.
         */
        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;
        
        /**
         * The divide operator will allow us to 
         * divide values which are NUMBER data types.
         */
        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;
        
        /**
         * The `additive` operator will allow us to 
		 * add numbers together.
         */
        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;
        
        /**
         * The remainder operator will allow us to 
         * retrieve the remainder of the value being 
         * divided by.
         */
        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
		
	}

}

/**
 * In Java you can also have classes within a class. However, the class
 * should not contain an access modifier e.g. 
 * 
 * public class UnaryDemo. Java will complain to saying:
 * - The public type UnaryDemo must be defined in its own file.
 *
 */
class UnaryDemo {

    public static void main(String[] args) {
    	
    	/**
    	 * Now there are some shortcuts to perform 
    	 * actions such as incrementing a value by one or 
    	 * decrementing a value by one. Such actions can 
    	 * be performed by Unary Operators.
    	 * 
    	 * The unary operators require only one operand; 
    	 * they perform various operations such as incrementing/decrementing a 
    	 * value by one, negating an expression, 
    	 * or inverting the value of a boolean.
    	 *  
    	 *  Unary plus operator; indicates positive value (numbers are positive without this, however)
    	 */
        int result = +1;
        // result is now 1
        System.out.println(result);
        
        /**
         * Decrement operator; decrements a value by 1
         */
        result--;
        // result is now 0
        System.out.println(result);
        
        /**
         * Increment operator; increments a value by 1
         */
        result++;
        // result is now 1
        System.out.println(result);
        
        /**
         * Unary minus operator; negates an expression
         */
        result = -result;
        // result is now -1
        System.out.println(result);
        
        /**
         * Logical complement operator; inverts the value of a boolean.
         * Of course we are assigning a boolean but there will be 
         * situations where you will need to use the boolean value 
         * for condition statement that are determined by the 
         * value of true or false.
         * 
         * An example would be:
         * 
         * if (success == true){then do ....}
         * 
         * or 
         * 
         * if (success != true){then do ....}
         */
        boolean success = false;
        /**
         * == would represent `equal to`. So since our variable `success`
         * has a value of `false` assigned to it, when we have a conditional
         * statement that checks if `success` is `false`, the program should 
         * print out the value of success.
         */
        if (success == false)
        	System.out.println(success);
        
        /**
         * != would represent `NOT equal to`. So in this case we will only print out
         */
        if (success != true)
        	System.out.println(!success);
    }
}

/**
 * The equality and relational operators determine if one operand is greater than, 
 * less than, equal to, or not equal to another operand. 
 * The majority of these operators will probably look familiar to you as well. 
 * Keep in mind that you must use "==", not "=", when testing if 
 * two primitive values are equal.
 *
 */
class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        
        /**
         * This checks if value1 is `equal to` value2.
         * If it is, it'll evaluate to true and we print it out.
         */
        if(value1 == value2)
            System.out.println("value1 is equal to value2");
        
        /**
         * This checks if the value1 is `NOT equal to` value 2.
         * If it isn't then it'll evaluate to true and we print it out.
         */
        if(value1 != value2)
            System.out.println("value1 is not equal to value2");
        
        /**
         * This checks if the value1 is `greater` value 2.
         * If it is then it'll evaluate to true and we print it out.
         */
        if(value1 > value2)
            System.out.println("value1 is greater than value2");
        
        /**
         * This checks if the value1 is `less than` value 2.
         * If it is then it'll evaluate to true and we print it out.
         */
        if(value1 < value2)
            System.out.println("value1 is less than value2");
        
        /**
         * This checks if the value1 is `less than or equal to` value 2.
         * If it is then it'll evaluate to true and we print it out.
         */
        if(value1 <= value2)
            System.out.println("value1 is less than or equal to value2");
    }
}

/**
 * The && and || operators perform Conditional-AND and Conditional-OR 
 * operations on two boolean expressions. These operators exhibit 
 * "short-circuiting" behavior, which means that the second operand 
 * is evaluated only if needed.
 * 
 * && Conditional-AND
 * || Conditional-OR
 */
class ConditionalDemo1 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        
        /**
         * If the first boolean expression is `equal to` 1 return true then
         * the second expression is not run. However, should it 
         * fail, then the second expression will be run. If the 
         * second expression is `equal to` 1 return true, then return the output.
         */
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        
        /**
         * If the first boolean expression is `equal to` 1 return true then 
         * the second expression is not run. However, should it 
         * fail, then the second expression will be run. If the 
         * second expression is `equal to` 1 return true, then return the output.
         */
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}

/**
 * Another conditional operator is ?:, which can be thought of as shorthand 
 * for an if-then-else statement (discussed in the Control Flow Statements 
 * section of this lesson). This operator is also known as the ternary 
 * operator because it uses three operands. 
 * In the following example, this operator should be read as: 
 * "If someCondition is true, assign the value of value1 to result. 
 * Otherwise, assign the value of value2 to result."
 *
 */
class ConditionalDemo2 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        
        /**
         * This expression will set the `value1` to `result` IF
         * `someCondition` is `true` otherwise it will set `value2`
         * to result IF `someCondition` is not true (false).
         */
        result = someCondition ? value1 : value2;

        System.out.println(result);
        /**
         * Because someCondition is true, this program prints "1" 
         * to the screen. Use the ?: operator instead of an 
         * if-then-else statement if it makes your code more readable; 
         * for example, when the expressions are compact and 
         * without side-effects (such as assignments).
         */
    }
}

/**
 * The instanceof operator compares an object to a specified type. 
 * You can use it to test if an object is an instance of a class, an instance 
 * of a subclass, or an instance of a class that implements a particular interface.
 * 
 * The following program, InstanceofDemo, defines a parent class (named Parent), 
 * a simple interface (named MyInterface), and a child class (named Child) 
 * that inherits from the parent and implements the interface.
 *
 */
class InstanceofDemo {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println("obj1 instanceof Parent: "
            + (parent instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (parent instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (parent instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (child instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (child instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (child instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}

class Challenge{
	
	public static void main(String[] args) {
		
		double myDouble = 20;
		double mySecDouble = 80;
		
		myDouble += mySecDouble;
		System.out.println("Both numbers added up = " + myDouble);
		
		myDouble *= 25;
		System.out.println("Sum multiplied by 25 = "  + myDouble);
		
		myDouble %= 40;
		System.out.println("Remainder from dividing by 40 = " + myDouble);
		
		if (myDouble <= 20){
			System.out.println("Total was over the limit");
		}
		
	}
}
