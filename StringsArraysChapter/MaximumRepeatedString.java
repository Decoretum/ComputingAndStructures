package StringsArraysChapter;
import java.util.*;

//how to find the maximal length of a repeated character in a string.
public class MaximumRepeatedString {
    public static void maxRepeat(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        int counter = 0;

        //We chain operations based on the previous element
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (i == 0)
            {
                hm.put(c, 1);
                counter++;
            }
            else
            {
                char prev = s.charAt(i - 1);
                if (c == prev)
                {
                    counter++;
                    hm.put(c, counter);
                }
                else
                {
                    counter = 1;
                }
            }
        }

        //Finding Max
        int max = 0;
        char var = ' ';
        for (Character i : hm.keySet())
        {
            int num = hm.get(i);
            if (num > max)
            {
                max = num;
                var = i;
            }
        }

        System.out.println("String Sequence: " + s);
        System.out.println("Max of Character " + var + ": " + max);
    }

    public static void main (String args[]){
        maxRepeat("abcdeeefghij");
        maxRepeat("aaaxyz");
        maxRepeat("abcdef");
    }
}
