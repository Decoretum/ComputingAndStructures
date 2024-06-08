package StringsArraysChapter;
import java.util.*;

public class LongestPalindrome {
    
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            char char1 = s.charAt(i);
            sb.append(char1);
        }
        return sb.toString();
    }

    public static void longest(String s){
        HashMap<String, Integer> scores = new HashMap<>();
        for (int i = 0; i < s.length(); i++){ //second pointer - expounding
            for (int j = i; j < s.length() + 1; j++){ //first pointer - main one
                String subString = s.substring(i, j);
                String reversed = reverse(subString);
                boolean palin = subString.equals(reversed);
                if (palin) scores.put(subString, reversed.length());
            }
        }

        String maxKey = "";
        int n = 0;
        for (String palin : scores.keySet()){
            if (scores.get(palin) > n){
                n = scores.get(palin);
                maxKey = palin;
            } 
        }

        System.out.println("Max Palindrome is: \"" + maxKey + "\" with a length of " + n);
    }

    public static void main (String args[]){
        longest("abcdefgabccbax");
    }
}
