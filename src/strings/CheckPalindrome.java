package strings;

import strings.utilities.CheckNullStringError;

public class CheckPalindrome {

    public static boolean isPalindrome(String str)
    {
        CheckNullStringError.checkNullStringError(str);
        int left = 0;
        int right =  str.length() - 1;

        while (left < right)
        {
            if (Character.toLowerCase(str.charAt(left)) !=
                    Character.toLowerCase(str.charAt(right)))
            {
                return false;
            }

            left++;
            right--;

        }return true;
    }
}
