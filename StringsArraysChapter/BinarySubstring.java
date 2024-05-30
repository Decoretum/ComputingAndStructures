package StringsArraysChapter;
import java.util.*;

public class BinarySubstring {
    //Get binary values based on a width
    static String substring(int width)
    {
        ArrayList<String> strings = new ArrayList<>();
        boolean on = true;
        int start = 0;
        while(on)
        {
            String binString = to_number(start, 2);
            if (binString.length() > width)
            {
                break;
            }
            strings.add(binString);
            start++;
        }
        return "Binary Strings of Width " + width + ": " + strings;
    }

    public static String to_number(int num, int base)
    {
        StringBuilder result = new StringBuilder();
        int quotient = Math.floorDiv(num, base);
        int remainder = num % base;
        Stack<Object> stack = new Stack<>();
        while (quotient != 0)
        {  
            // System.out.println("Quotient: " + quotient + " Remainder: " + remainder);
            stack.push(remainder);
            remainder = quotient % base;
            quotient = Math.floorDiv(quotient, base);
        }
        // System.out.println("Last remainder: " + remainder);
        stack.push(remainder);

        while (!stack.isEmpty())
        {
            Object digit = stack.pop();
            result.append(digit);
        }

        return result.toString();
    }

    public static String to_n(int num, int base)
    {
        StringBuilder result = new StringBuilder();
        Stack<Object> stack = new Stack<>();
        int quotient = 0;
        int remainder = 0;
        boolean start = false;
        while (true)
        {  
            if (start == false) //first iteration
            {
                quotient = Math.floorDiv(num, base);
                remainder = num % base;
                start = true;
                stack.push(remainder);
            }
            else //succeeding iterations
            {
                remainder = quotient % base;
                stack.push(remainder);
                quotient = Math.floorDiv(quotient, base);
                if (quotient == 0)
                {
                    break;
                }
            }
            System.out.println("Quotient: " + quotient + " Remainder: " + remainder);

        }
        // // System.out.println("Last remainder: " + remainder);
        // stack.push(remainder);

        while (!stack.isEmpty())
        {
            Object digit = stack.pop();
            result.append(digit);
        }

        return result.toString();
    }

    public static void main (String args[])
    {
        // System.out.println(substring(10));
        System.out.println(to_n(56, 2));
    }
}
