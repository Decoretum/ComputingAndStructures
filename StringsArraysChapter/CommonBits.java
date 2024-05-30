package StringsArraysChapter;
import java.util.*;

//Find the longest possible common substring of the bits between two binary numbers
public class CommonBits {
    static String common(int n1, int n2)
    {
        //Get their binary representation
        String b1 = BinarySubstring.to_n(n1, 2);
        String b2 = BinarySubstring.to_n(n2, 2);
        
        if (b1.length() < b2.length())
        {
            b1 = '0' + b1;
        }
        else if (b2.length() < b1.length())
        {
            b2 = '0' + b2;
        }
        // System.out.println(b1);
        // System.out.println(b2);
        
        //Iterate over the strings
        //assume both binary numbers have the same length
        //ArrayList as counter collector
        int counter = 0;
        int length = b1.length();
        ArrayList<Integer> collector = new ArrayList<>();

        for (int i = 0; i < length; i++)
        {
            char bit1 = b1.charAt(i);
            char bit2 = b2.charAt(i);

            if (bit1 == bit2)
            {
                counter++;
            }
            else
            {
                collector.add(counter);
                counter = 0;
            }
        }
        
        System.out.println(collector);
        return n1 + " and " + n2 + " have " + Collections.max(collector) + " consecutive longest bits in common";
    }

    public static void main (String args[])
    {
        System.out.println(common(100, 110));
    }
}
