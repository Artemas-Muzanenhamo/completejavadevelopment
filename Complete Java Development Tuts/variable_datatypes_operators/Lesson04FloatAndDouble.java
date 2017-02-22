package variable_datatypes_operators;

/**
 * Created by amuzanenhamo on 22/02/2017.
 */
public class Lesson04FloatAndDouble {

    public static void main(String[] args) {

        /**
         * So how do we deal with floating point numbers
         * in Java? So that is numbers that have a
         * decimal point.
         *
         * Now there are two type of Data types
         * in Java that deal with floating point
         * numbers and they are called the Float and
         * the Double.
         *
         */


        /**
         * Float - The float data type is a single-precision
         * 32-bit IEEE 754 floating point. Its range of values
         * is beyond the scope of this discussion, but is
         * specified in the Floating-Point Types, Formats,
         * and Values section of the Java Language Specification.
         * As with the recommendations for byte and short,
         * use a float (instead of double) if you need to save
         * memory in large arrays of floating point numbers.
         *
         * This data type should never be used for precise values,
         * such as currency. For that, you will need to use the
         * java.math.BigDecimal class instead. Numbers and Strings
         * covers BigDecimal and other useful classes provided by
         * the Java platform.
         * 
         * The float variable value is identified by the literal with the 
         * letter f at the end.
         */
    	float myFloatValue = 10.12f;

        /**
         * Double - The double data type is a double-precision
         * 64-bit IEEE 754 floating point. Its range of values
         * is beyond the scope of this discussion, but is specified
         * in the Floating-Point Types, Formats, and Values section
         * of the Java Language Specification. For decimal values,
         * this data type is generally the default choice.
         *
         * As mentioned above, this data type should never be
         * used for precise values, such as currency.
         * 
         * The double variable value is identified by the literal with the 
         * letter d at the end. 
         */
    	double myDoubleValue = 10.25d;
    	
    	/**
    	 * By default, with floating point numbers, Java defaults to 
    	 * the `double` data type. So the variable declaration below is
    	 * valid
    	 */
    	myDoubleValue = 5;
    	System.out.println("myDoubleValue = " + myDoubleValue);
    	
    	/**
    	 * Should we have a situation where we need to divide the 
    	 * double. The outcome will be different than that of an 
    	 * int.
    	 */
    	
    	int myIntValue = 5 / 3; //Would return 1 but it would not return the remainder.
    	System.out.println("myIntValue divided by 3 = " + myIntValue);
    	
    	/**
    	 * In the case of floating point numbers, it would be 
    	 * different as remainders are handled / returned as below
    	 */
    	
    	myDoubleValue = myDoubleValue / 3d;
    	System.out.println("myDoubleValue divided by 3 = " + myDoubleValue);
    	
    	/**
    	 * In regards to `float` data type, an error is thrown when we
    	 * declare a decimal value without putting the `f` letter at the 
    	 * end as below. This is because Java defaults to the `double` type.
    	 * 
    	 *  myFloatValue = 100.14; <- Returns: Type mismatch: cannot convert from double to float
    	 *  
    	 *  In order to make this valid we could:
    	 *  - Change the myFloatValue data type to double.
    	 *  - Cast the Literal to float. 
    	 *  	* So myFloatValue = (float)100.14;
    	 *  - Place the letter f at the end of our literal. 
    	 *  	* So myFloatValue = 100.14f;
    	 */
    	
    	myFloatValue = 5f;
    	System.out.println("myFloatValue = " + myFloatValue);
    	
    	/**
    	 * The float would also return the remainder as would with the 
    	 * double data type. However the difference would be the 
    	 * precision in returning the amount of values after the decimal
    	 * point. The float returns 7 numbers after the decimal point where 
    	 * the float returns double the amount of number as it is 
    	 * more PRECISE. 
    	 */
    	myFloatValue = myFloatValue / 3f;
    	System.out.println("myFloatValue divided by 3 = " + myFloatValue);
    	
    	/**
    	 * Now if we think about the width of our data types we can see there are 
    	 * some differences between them.
    	 * 
    	 * - width of an int  = 32 (4 bytes)
    	 * - width of a float = 32 (4 bytes)
    	 * - width of a double = 64(8 bytes)
    	 */
    	


    }
}
