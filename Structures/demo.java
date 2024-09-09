package Structures;

import Structures.LinkedList.CircularLinkedList;
import Structures.Stack.GaelStack;

import java.util.ArrayList;
import java.util.HashMap;

import Structures.LinkedList.*;

public class demo {
    public static void main (String args[])
    {
        // CircularLinkedList SLL = new CircularLinkedList(20);
        // SLL.appendNode(13);
        // SLL.appendNode(1);
        // System.out.println("ends here");
        // SLL.insertNode(8, 49);
        // SLL.insertNode(1, 9);
        // SLL.printList();
        // SLL.deleteNode(2);
        // SLL.deleteNode(3);
        // System.out.println("");
        // SLL.printList();

        // System.out.println("");
        // // SLL.deleteNode(1000);
        // SLL.printList();
        // System.out.println("");
        // // SLL.updateNode(2, 15);
        // System.out.println("");
        // SLL.printList();
        // System.out.println("");

        // DoublyLinkedList SLL = new DoublyLinkedList(20);
        // SLL.appendNode(13);
        // SLL.appendNode(1);
        // SLL.insertNode(8, 49);
        // SLL.insertNode(1, 9);
        // SLL.printList();

        // SLL.deleteNode(2);
        // SLL.deleteNode(3);
        // SLL.printList();

        // SLL.insertNode(2, 41);
        // SLL.insertNode(3, 18);
        // SLL.printList();
        // SLL.lastKNodes(SLL, 3);
        
        GaelStack s = new GaelStack(10);
        s.push(9);
        s.push(8);
        s.push(1);
        s.push(32);
        s.push(8);

        //Assuming stack contains numbers
        GaelStack s2 = new GaelStack(10);
        s2.push('g');
        s2.push('a');
        s2.push('e');
        s2.push('l');
        
        while (!s2.isEmpty())
        {
            Object el = (Object) s2.pop();
            System.out.print(el);
        }

        //Stack palindrome
        GaelStack s3 = new GaelStack(10);
        String samp = "tattarrattat";
        StringBuilder samp2 = new StringBuilder();
        
        for (int i = 0; i <= samp.length() - 1; i++)
        {
            char c = samp.charAt(i);
            samp2.append(c);
        }

        while (!s3.isEmpty())
        {
            Object el = s3.pop();
            samp2.append(el);
        }

        String samp3 = samp2.toString();

        System.out.println(samp.equals(samp3));

        //Balanced parentheses
        GaelStack s4 = new GaelStack(1000);
        String samppar = "(())(()()()()()]";
        HashMap<Object, Object> left = new HashMap<>();
        left.put("[", "]");
        left.put("{", "}");
        left.put("(", ")");
        for (int i = 0; i <= samppar.length() - 1; i++)
        {
            String c = String.valueOf(samppar.charAt(i));
            if (left.containsKey(c))
            {
                s4.push(c);
            }

            else if (left.containsValue(c))
            {
                Object popped = s4.peek();
                if (!left.get(popped).equals(c))
                break;

                else
                s4.pop();
            }

        }

        System.out.println("Balanced Parentheses: " + s4.isEmpty());
        
    }
    
    
}
