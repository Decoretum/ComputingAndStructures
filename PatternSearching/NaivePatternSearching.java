package PatternSearching;

public class NaivePatternSearching {
    
    public static void naiveSearch(String text, String pattern)
    {
        for (int i = 0; (i + pattern.length()) - 1 <= text.length() - 1; i++)
        {
            StringBuilder builder = new StringBuilder();
            for (int j = i; j <= (i + pattern.length() - 1); j++)
            {
                char character = text.charAt(j);
                builder.append(character);
            }

            String completedParsed = builder.toString();
            if (completedParsed.equals(pattern))
            {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}

/*  
 * Time Complexity
 * O(m * n) wherein m is the size of the pattern, and n is the size of the text
 * 
 Space Complexity
 O(1)
 * 
 * Complexity Analysis of Naive algorithm for Pattern Searching:
    Best Case: O(n)
    When the pattern is found at the very beginning of the text (or very early on).
    The algorithm will perform a constant number of comparisons, typically on the order of O(n) comparisons, where n is the length of the pattern.
    Worst Case: O(n2)
    When the pattern doesn’t appear in the text at all or appears only at the very end.
    The algorithm will perform O((n-m+1)*m) comparisons, where n is the length of the text and m is the length of the pattern.
    In the worst case, for each position in the text, the algorithm may need to compare the entire pattern against the text.
 */
