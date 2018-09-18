package KLi;

public class KLiLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static String isPalindrome(String str)
    {
        String reversedStr = "";
        for(int i = str.length(); i > 0; i--)
        {
            String letter = str.substring(i-1,i);
            reversedStr += letter;
        }
        if(reversedStr.equalsIgnoreCase(str))
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }

    public static String dateStr(String str)
    {
        String str1 = str.substring(0,2);
        String str2 = str.substring(3,5);
        String str3 = str.substring(6,str.length());
        return str2 + "-" + str1 + "-" + str3;
    }

    public static String sumUpTo(int range)
    {
        if(range < 0)
            return "false";
        else {
            int sumOfNumbers = 0;
            for (int i = 0; i <= range; i++) {
                sumOfNumbers += i;
            }
            String stringOfNum = Integer.toString(sumOfNumbers);
            return stringOfNum;
        }
    }
}
