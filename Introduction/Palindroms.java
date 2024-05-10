package Introduction;

public class Palindroms {
    
    public static void palindrome(String str)
    {
        int length = str.length();

        int i = 0;
        int j = length - 1;
        char p1 = str.charAt(i);
        char p2 = str.charAt(j);
        boolean pal = true;

        while (p1 != p2)
        {
            if (p1 != p2)
            {
                pal = false;
                System.out.println(str + " is not a palindrome!");
                break;
            }
            else
            {
                i++;
                j--;
            }
        }
        if (pal == true)
        {
            System.out.println(str + " is a palindrome!");
        }
        
    }

    public static void main (String args[])
    {
        String[] names = {"Dave", "BoB", "radar", "rotor"};
        int[] numbers = {1234, 767, 1234321, -101};
        for (String name : names)
        {
            palindrome(name);
        }
    }
}
