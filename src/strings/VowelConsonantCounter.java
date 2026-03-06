package strings;

import strings.utilities.CheckNullStringError;

public class VowelConsonantCounter
{
    private static final String VOWELS = "aeiouAEIOU";
    public static int vowelCount(String str)
    {
        CheckNullStringError.checkNullStringError(str);

        int count = 0;

        for (char ch : str.toCharArray())
        {
            if (VOWELS.indexOf(ch) >= 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int consonantCount(String str)
    {
        CheckNullStringError.checkNullStringError(str);

        int count = 0;

        for (char ch :  str.toCharArray())
        {
            if (Character.isLetter(ch) &&
                    VOWELS.indexOf(ch) < 0)
            {
                count++;
            }
        }
        return count;

    }
}
