import PatternSearching.NaivePatternSearching;

public class Execution {
    
    public static void main(String[] args)
    {
        String s = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        NaivePatternSearching.naiveSearch(s, pattern);
    }
}
