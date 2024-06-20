package StringsArraysChapter;
import java.util.*;

//Finding maximum repeated substring in a string
//Runtime is directly proportional to the length of the input (O(n ^ 2))
//2 pointers
public class MaximumRepeatedSubstring {
    
    public static void getMaxSub(String s)
    {
        HashMap<String, Integer> tool = new HashMap<>();

        //Main Pointer 
        for (int i = 0; i < s.length() - 1; i++)
        {   //2nd Pointer
            for(int j = i + 1; j < s.length(); j++)
            {   
                String subString = s.substring(i, j + 1);
                if (tool.containsKey(subString))
                {
                    int oldVal = tool.get(subString);
                    tool.put(subString, oldVal + 1);
                } 
                else 
                {
                    tool.put(subString, 1);
                }
                
            }
        }

        //Evaluation Stage
        int max = 0;
        String maxSub = "";
        for (String i : tool.keySet())
        {
            int subVal = tool.get(i);
            if (subVal > max) //comparing frequency
            {
                if (i.length() > maxSub.length()) //comparing length
                max = tool.get(i);
                maxSub = i;
            }
        }

        if (max == 0)
        {
            System.out.println("There is no Max is the substrings available");
        } 
        else
        {
            System.out.println("Max Repeating Substring: " + maxSub);
            System.out.println("Value: " + max);
        }

        // System.out.println(tool);

    }

    public static void main (String args[])
    {
        getMaxSub("abcdefgabccbaxyz");
    }
}
