package strings;


import strings.utilities.CheckNullStringError;

public class ReverseString
{


    public static String  reverseString(String str) throws IllegalArgumentException
    {
        CheckNullStringError.checkNullStringError(str);
        return new StringBuilder(str).reverse().toString();
    }
}
