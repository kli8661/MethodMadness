package KLi;

import static KLi.KLiLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        //Test
        println("I love a cup of Java in the morning.");

        //Testing palindrome if it's correct
        println(isPalindrome("racecar"));

        //Testing palindrome if the string is false
        println(isPalindrome("apple"));

        //Testing birthday string
        println(dateStr("09/18/2001"));

        //Testing range for sumUpTo
        println(sumUpTo(10));

        //Testing if range is negative
        println(sumUpTo(-10));
    }

}
