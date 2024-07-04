public class LowLevel {
    

    public static void main (String args[])
    {
        int a = 12;
        int b = 2;
        int extractedBits = a >>> b;
        int x = 5; //     0000000000000101
        int y = x << 1; //0000000000001010
        int y2 = x >> 1; //000000000000010
        // System.out.println((x << 1) & x);
        System.out.println(Integer.toBinaryString(y2));
    }
}
