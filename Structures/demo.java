package Structures;

import Structures.LinkedList.CircularLinkedList;
import Structures.LinkedList.SingleLinkedList;

public class demo {
    public static void main (String args[])
    {
        CircularLinkedList SLL = new CircularLinkedList(20);
        SLL.appendNode(13);
        SLL.appendNode(1);
        System.out.println("ends here");
        SLL.insertNode(8, 49);
        SLL.insertNode(1, 9);
        SLL.printList();
        SLL.deleteNode(2);
        SLL.deleteNode(3);
        System.out.println("");
        SLL.printList();
        // System.out.println("");
        // // SLL.deleteNode(1000);
        // SLL.printList();
        // System.out.println("");
        // // SLL.updateNode(2, 15);
        // System.out.println("");
        // SLL.printList();
        // System.out.println("");
    }
    
    
}
