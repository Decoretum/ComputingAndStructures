import PatternSearching.KMP;
import PatternSearching.NaivePatternSearching;

public class Execution {
    
    public static void main(String[] args)
    {
        String s = "AABAACAADAABAAABAA";
        String pattern = "AABA";

        String s2 = "ABC ABCDAB ABCDABCDABDE";
        String s3 = "ABCDABD ABCDABCDABDE";
        String pattern2 = "ABCDABD";
        // NaivePatternSearching.naiveSearch(s, pattern);
        KMP.kmp(s3, pattern2);
    }
}
