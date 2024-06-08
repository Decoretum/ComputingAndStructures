package StringsArraysChapter;
import java.util.*;

//From an Array containing arrays of words (Sentences), I want to count them
public class WordFrequency {
    
    static void counter(ArrayList<String> words)
    {
        HashMap<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < words.size(); i++)
        {
            String word = words.get(i);
            if (!counter.containsKey(word))
            {
                counter.put(word, 1);
            }
            else
            {
                Integer old = counter.get(word);
                counter.put(word, old + 1);
            }
        }

        for (String word : counter.keySet())
        {
            System.out.println("Instances of word " + word + ": " + counter.get(word));
        }
        
    }

    public static void main (String args[])
    {
        // String[][] words = {{"This", "is", "my", "first", "story"}};
        String[] a1 = {"This", "is", "my", "first", "story"};
        String[] a2 = {"This", "used", "to", "be", "my", "journal"};
        String[] a3 = {"I", "yonder", "over", "the", "rainbow"};
        ArrayList<String> s1 = new ArrayList<>();
        s1.addAll(Arrays.asList(a1));
        s1.addAll(Arrays.asList(a2));
        s1.addAll(Arrays.asList(a3));
        counter(s1);
        
        
    }
}
