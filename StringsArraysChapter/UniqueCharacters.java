package StringsArraysChapter;
import java.util.*;

public class UniqueCharacters {

    public static boolean unique(String str)
    {
        ArrayList<Character> chr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
        {
            Character c = str.charAt(i);

            if (Character.isWhitespace(c))
            {
                continue;
            }
            if (!chr.contains(c))
            {
                chr.add(c);
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main (String args[])
    {
        System.out.println(unique("i am k t ui"));
    }
}
