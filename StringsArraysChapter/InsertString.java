package StringsArraysChapter;
import java.util.*;

/* 
str1: abc
str2: def
result: dabc adbc abdc abcd eabc aebc abec abce fabc afbc abfc abcf
O(n ^ 2)
 */
public class InsertString {
    public static void insert(String s1, String s2) //s1 is the receiver
    {

        for (int counter = 0; counter < s2.length(); counter++) //iterate over interloper
        {
            for (int i = 0; i < s1.length() + 1; i++) //iterate over receiver
            {   
                // We will always append 1 to the size of the receiver
                // We will choose to do Arrays which are more taxing in memory than a foor-loop (time)
                int subCounter = 0; // points to the original receiver string
                char[] word = new char[s1.length() + 1];

                if (counter < s2.length())
                {
                    char c = s2.charAt(counter);
                    word[i] = c;
                }
                

                for (int j = 0; j < s1.length() + 1; j++)
                {
                    if (j == i)
                    {
                        continue;
                    }
                    else
                    {
                        char origc = s1.charAt(subCounter);
                        word[j] = origc;
                        subCounter++;
                    }
                }
                String complete = new String(word);
                System.out.print(complete + ", ");
            }
        }
    }

    public static void main (String args[])
    {
        insert("abc", "def");
    }
}
