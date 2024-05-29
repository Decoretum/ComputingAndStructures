package Introduction.Tasks;

import java.util.*;

public class BalancedParentheses {
    static String balanced(String s)
    {
        // I will be using a Stack
        Stack<Object> stack = new Stack<>();

        //Hashmap will save character opening and closing
        HashMap<Object, Object> chars = new HashMap<>();

        chars.put('(',')');
        chars.put('[',']');
        chars.put('{','}');
        chars.put('<','>');

        int stringlen = s.length();
        for (int i = 0; i < stringlen; i++)
        {
            char digit = s.charAt(i);

            //if the digit is opening
            if (chars.keySet().contains(digit))
            {
                stack.push(digit);
            }

            //if digit is closing
            else
            {
                //pop from the stack to get its equiavalent and compare
                Object popped = stack.pop(); //presumably the opening one
                boolean match = chars.get(popped).equals(digit);

                if (!match)
                {
                    return "Result: String enclosing characters aren't a match";
                }
            }
        }

        return "Result: String enclosing characters match";

    }

    public static void main (String args[])
    {
        System.out.println(balanced("[()]{}{[()()]()}"));
        System.out.println(balanced("[(])"));
        System.out.println(balanced("(){}[]"));
    }
}
