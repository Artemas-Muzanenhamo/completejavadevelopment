/**
 * Created by Artemas on 21/02/2017.
 */
public class Variables {

    public static void main(String[] args){

    /*
    * A Variable is a place in memory like a box that
    * allows you to store something in it. And a computer
    * allows to have hundreds or thousands of those boxes
    * all with their own pieces of information.
    *
    * We can assign the type of info and we can also give
    * it a name.
    *
    * They make a program useful. So a variable is used to
    * store information.
    *
    *
    * A basic variable we will use will be an variable of
    * data type `int`. Of course the `int` stands for
    * Integer so mathematically it will be a data type that
    * can take values that are WHOLE NUMBERS without any
    * decimal points.
    *
    * The formality for declaring a variable are as follows:
    * [data type] [variable name/memory location] = [value<optional>]
    * */

        int myFirstNumber = 5;

        /**
         * Print the variable value to see it on the screen
         *
         * To show the value of the variable, we would need
         * to put the variable name in the
         * System.out.println([variable name here]) parameter.
         * Java will look for the memory location or variable
         * in memory and will retrieve the value of it back.
         * In our case we assigned 5 as the value in the
         * memory location so 5 will be stored as the value
         * of `myFirstNumber` which will be returned by Java
         * when we call the variable name.
         */
        System.out.println(myFirstNumber);

    }





}
