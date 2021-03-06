//Kent Li, 9/20/2018

package KLi;

import static KLi.KLiLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        //Test line
        println("I love a cup of Java in the morning.");

        //Testing palindrome if it's correct
        println(isPalindrome("1001"));

        //Testing palindrome if the string is false
        println(isPalindrome("1101"));

        //Testing date string
        println(dateStr("09/18/2001"));

        //Testing range for sumUpTo
        println(sumUpTo(5));

        //Testing multiplication table
        multiplicationTable(3,4);

        //Testing Quadratic for single root
        println(quadSolver(1,-6,9));

        //Testing Quadratic for imaginary roots
        println(quadSolver(1,0,4));

        //Testing Quadratic for two distinct roots
        println(quadSolver(-1.0,-8.0,15.0));
    }
}
