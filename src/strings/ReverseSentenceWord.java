package strings;

import strings.utilities.CheckNullStringError;

public class ReverseSentenceWord
{
    public static String reverseSentenceWords(String sentence)
    {

        CheckNullStringError.checkNullStringError(sentence);
        if (sentence.isBlank())
        {
            return sentence;
        }

        StringBuilder revString = new StringBuilder();
        StringBuilder helper = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words)
        {
            helper.append(word);
            helper.reverse();
            revString.append(helper).append(" ");
            helper.setLength(0);
        }

        return revString.toString().trim();
    }
}
