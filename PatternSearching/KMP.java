package PatternSearching;
import java.util.*;
import java.util.regex.Pattern;

public class KMP {
    
    public static void kmp(String text, String pattern)
    {
        int[] lps = LPSArray(pattern);
        int pointerA = 0;
        boolean patternFound;
        ArrayList<Object> indexes = new ArrayList<>();
        while (pointerA <= text.length()-1)
        {
            patternFound = true;
            for (int i = 0; i <= pattern.length() - 1;)
            {
                char patternChar = pattern.charAt(i);
                char textChar = text.charAt(pointerA);

                if (patternChar != textChar)
                {
                    patternFound = false;
                    int mismatchedIndex = i;

                    if (mismatchedIndex == 0)
                    {
                        pointerA++;
                        break;
                    }

                    // System.out.println(patternChar + " at pattern index " + i);
                    // System.out.println(textChar + " at index " + pointerA);
                    int lpsValue = lps[mismatchedIndex - 1];

                    if (lpsValue == 0)
                    {
                        pointerA++; 
                        break;
                    }
                    
                    else {
                        char charFromPattern = pattern.charAt(lpsValue);
                        if (charFromPattern == textChar)
                        {
                            indexes.add(pointerA - lpsValue);
                            System.out.println("Pattern found at index " + (pointerA - lpsValue));
                            patternFound = true;
                            pointerA++;
                            i++;
                        } else {
                            pointerA++;
                            break;
                        }
                    }
                }

                else if (i == pattern.length() - 1 && patternFound == true)
               { 
                    System.out.println("Pattern found at index " + (pointerA - (pattern.length() - 1)));
                    pointerA++;
                }

                else if (patternChar == textChar)
                {
                    pointerA++;
                    i++;
                }
            }
            
        }

    }

    public static int[] LPSArray(String pattern)
    {
        int[] newArray = new int[pattern.length()];
        int i = 0, j = 1;
        while (j <= pattern.length() - 1)
        {
            char patternChar1 = pattern.charAt(j);
            char patternChar2 = pattern.charAt(i);
            if (patternChar1 == patternChar2)
            {
                newArray[j] = i + 1;
                i += 1;
                j += 1;
            } else {
                newArray[j] = 0;
                j += 1;
            }
        }
        return newArray;
    }
}
