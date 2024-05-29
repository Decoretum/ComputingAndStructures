package Introduction;

public class ReverseString {
    static String reverse(String s)
    {   
        if (s.length() == 1)
        {
            return s;
        }
        else 
        {
            String first = s.substring(0, s.length() - 1); //String except last
            String last = s.substring(s.length() - 1, s.length());
            return last + reverse(first);
        }
    }

    public static void main (String args[])
    {
        System.out.println(reverse("Gael"));
    }
}
