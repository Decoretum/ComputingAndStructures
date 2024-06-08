package StringsArraysChapter;
import java.util.*;

//Check if two strings are permutations of each other
//Using a consolidated hashmap/array
//I wont use built-in java sorting
public class StringPermutation {
    public static boolean checkPerm(String s1, String s2)
    {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++)
        {
            chars.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++)
        {
            char c = s2.charAt(i);
            if (chars.contains(c))
            {
                int position = chars.indexOf(c);
                chars.remove(position);
            }
            else
            {
                return false;
            }
        }

        if (chars.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void main (String args[])
    {
        System.out.println(checkPerm("abcdef", "efabcf"));
        System.out.println(checkPerm("abcdef", "defabc"));
    }
}
