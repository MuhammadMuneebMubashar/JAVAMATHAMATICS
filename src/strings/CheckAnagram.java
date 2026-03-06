package strings;
import strings.utilities.CheckNullStringError;


public class CheckAnagram {

    public static boolean areAnagrams(String str1, String str2) {
        CheckNullStringError.checkNullStringError(str1);
        CheckNullStringError.checkNullStringError(str2);

        if (str1.length() != str2.length()) {
            return false;
        }
        int len = str1.length();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int [] freq = new int[128];

        for (int i = 0; i < len; i++)
        {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for (int count : freq)
        {
            if (count != 0)
            {
                return false;
            }
        }
        return  true;
    }
}
