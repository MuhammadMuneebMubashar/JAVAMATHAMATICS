package strings.utilities;

public class CheckNullStringError
{
    public static void checkNullStringError(String str)
    {
        if (str == null){
            throw new IllegalArgumentException("--------Null string exception--------");
        }
    }
}
