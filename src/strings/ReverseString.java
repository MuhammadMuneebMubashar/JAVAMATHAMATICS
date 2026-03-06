package strings;


import strings.utilities.CheckNullStringError;

public class ReverseString
{


    public static String  reverseString(String str) throws IllegalArgumentException
    {
        CheckNullStringError.checkNullStringError(str);
        return new StringBuilder(str).reverse().toString();
    }

    public static String manualReverseString(String str) throws IllegalArgumentException
    {

        CheckNullStringError.checkNullStringError(str);
        if (str.isEmpty()){
            return str;
        }

        char [] arr = str.toCharArray();
        int len = arr.length;
        char temp;
        int swapPosition ;

        for (int i = 0 ; i < len/2 ; i++)
        {
            swapPosition = len - i - 1;
            temp = arr[i];
            arr[i] = arr[swapPosition];
            arr[swapPosition] = temp;
        }

        return new String(arr);
    }
}
