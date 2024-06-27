package StringsArraysChapter;

public class AdjacentSetBit {
    
    public static boolean check(int n)
    {
        int shifted = n << 1;
        System.out.println("Original Binary: " + Integer.toBinaryString(n));
        System.out.println("Shifted to Left once Binary: " + Integer.toBinaryString(shifted));
        return (n & (shifted)) != 0; //we shift to the left since 0s can be used as leading placeholders
    }

    public static void main (String args[])
    {
        System.out.println(check(12));
    }
}
