/**
 * Created by Artemas on 21/02/2017.
 */
public class ByteShortInt {

    public static void main(String[] args) {

        /**
         * Data Types -
         */

        /**
         * For the data type `int`
         * there is a limited range
         * to each data type.
         *
         * The right side of the variable is called
         * a literal. And since Java 7
         * we can space out our numbers from:
         * 2147483648 to 2_147_483_648
         * To make them more readable.
         *
         * `int` is double the size of a short
         *
         * int has a width of 32
         *
         * In this case the `int`
         * min value is as below:
         */
        int myIntMinValue = -2_147_483_648;

        /**
         * And the max value of the int is as
         * below:
         */
        int myIntMaxValue = 2_147_483_647;

        /**
         * In some instances we might not need to use
         * a lot of space/memory and we might just
         * want to use a data type that has less
         * range from the int.
         */

        /**
         * Byte - The byte data type is an 8-bit signed two's
         * complement integer. It has a minimum value of -128
         * and a maximum value of 127 (inclusive). The byte data
         * type can be useful for saving memory in large arrays,
         * where the memory savings actually matters.
         * They can also be used in place of int where their
         * limits help to clarify your code; the fact that a
         * variable's range is limited can serve as a form of
         * documentation.
         *
         * So a byte is half the size of an `short` but quarter
         * size of an `int`.
         *
         * byte has a width of 8
         */
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;

        /**
         * Short - The short data type is a 16-bit signed two's
         * complement integer. It has a minimum value of -32,768
         * and a maximum value of 32,767 (inclusive).
         * As with byte, the same guidelines apply: you can use
         * a short to save memory in large arrays, in situations
         * where the memory savings actually matters.
         *
         * So a short is half the size of an `int` but double
         * the size of a `byte`.
         *
         * short has a width of 16
         */

        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;

        /**
         * Long - The long data type is a 64-bit two's complement integer.
         * The signed long has a minimum value of -263 and a maximum value
         * of 263-1. In Java SE 8 and later, you can use the long data type
         * to represent an unsigned 64-bit long, which has a minimum value
         * of 0 and a maximum value of 264-1. Use this data type when you
         * need a range of values wider than those provided by int.
         * The Long class also contains methods like compareUnsigned,
         * divideUnsigned etc to support arithmetic operations for
         * unsigned long.
         *
         * long has a width of 64
         */
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;
        
    }

}
