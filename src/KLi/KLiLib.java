//Kent Li, 9/20/2018

package KLi;

public class KLiLib {

    //These are for letting println work with multiple inputs!
    public static void println(String str)
    {
        System.out.println(str);
    }
    public static void println(boolean str)
    {
        System.out.println(str);
    }
    public static void println(int str) { System.out.println(str); }

    /**
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str)
    {
        String reversedStr = ""; //Blank string to hold the new string
        for(int i = str.length(); i > 0; i--)
        {
            String letter = str.substring(i-1,i);
            reversedStr += letter;
        }
        if(reversedStr.equalsIgnoreCase(str)) //Testing if the new reversed string is equal to the original one
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *
     * @param str
     * @return
     */
    public static String dateStr(String str)
    {
        String str1 = str.substring(0,2); //Taking out the date in chunks then putting it back together.
        String str2 = str.substring(3,5);
        String str3 = str.substring(6);
        return str2 + "-" + str1 + "-" + str3;
    }

    /**
     *
     * @param range
     * @return
     */
    public static Integer sumUpTo(int range)
    {
        int sumOfNumbers = 0;
        for (int i = 0; i <= range; i++)
        {
            sumOfNumbers += i; //Adds previous number for sum up to.
        }
        return sumOfNumbers;
    }

    /**
     *
     * @param base
     * @param range
     */
    public static void multiplicationTable(int base, int range)
    {

        for(int i = 0; i <= range; i++) //Gives multiples of a number
        {
            int numbers = base * i;
            String numberString = String.valueOf(numbers);
            println(numberString);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static String quadSolver(double a, double b, double c)
    {
        double rootOne, rootTwo, discriminant;
        discriminant = (b * b - 4 * a * c); //b^2 - 4ac, this is how you find out if a quadratic will have a single root, two roots, or a single root.
        if (discriminant < 0)
        {
            return "Roots are Imaginary!";
        }
        else if (discriminant > 0)
        {
            rootOne = (-b + Math.sqrt(discriminant))/(2 * a);
            rootTwo = (-b - Math.sqrt(discriminant))/(2 * a);
            String rt1 = Double.toString(rootOne);
            String rt2 = Double.toString(rootTwo);
            return "Your roots are: " + rt1 + ", " + rt2; //returns roots
        }
        else
        {
            rootOne = (-b + Math.sqrt(discriminant))/(2 * a);
            String rt1 = Double.toString(rootOne);
            return "Your root is " + rt1;
        }
    }
}
