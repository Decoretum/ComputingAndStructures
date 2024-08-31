package Structures.LinkedList;
import java.util.*;

//An entity of this represents a "node" of a single linked list
//These entities connected together is known as a single linked list
public class SingleLinkedList {
    Integer value;
    SingleLinkedList next;

    public SingleLinkedList (int val) {
        value = val;
        setNext(null);
    }

    //Append node 
    //insert node at the last value of the linked list
    public void appendNode(int val)
    {
        SingleLinkedList currNode = this;
        while (currNode != null)
        {   
            if (currNode.getNext() == null)
            break;

            currNode = currNode.getNext();
        }
        SingleLinkedList newNode = new SingleLinkedList(val);
        currNode.setNext(newNode);
    }

    //Insert node at a specific position
    public void insertNode(int position, int val)
    {
        int counter = 0;
        SingleLinkedList currNode = this;
        SingleLinkedList backNode = null;
        while (currNode != null)
        {
            if (counter == position || currNode.getNext() == null)
            break;

            backNode = currNode;
            currNode = currNode.getNext();
            counter++;
        }

        if (counter < position)
        {
            appendNode(val);
        } else {
            SingleLinkedList newNode = new SingleLinkedList(val);
            SingleLinkedList nextNode = currNode.getNext();
            backNode.setNext(newNode);
            newNode.setNext(currNode);
            currNode.setNext(nextNode);
        }
    }

    //update node at position
    public void updateNode (int position, int newValue)
    {
        SingleLinkedList currNode = this;

        while (currNode != null)
        {
            if (currNode.getNext() == null)
            break;

            currNode = currNode.getNext();
        }

        currNode.value = newValue;
    }

    //Delete Node at position
    public void deleteNode(int position)
    {
        int counter = 0;
        SingleLinkedList currNode = this;
        SingleLinkedList backNode = null;
        while(currNode != null)
        {
            if (counter == position || currNode.getNext() == null)
            break;

            backNode = currNode;
            currNode = currNode.getNext();
            counter++;
        }

        if (counter < position)
        backNode.setNext(null);

        else if (backNode == null)
        this.value = null;

        else {
            backNode.setNext(currNode.getNext());
        }
    }

    public void printList()
    {
        SingleLinkedList currNode = this;
        while (currNode != null)
        {
            if (currNode.getNext() != null)
            System.out.print(currNode.value + " -> ");

            else
            System.out.print(currNode.value);

            currNode = currNode.getNext();
        }
    }

    public SingleLinkedList getNext ()
    {
        return next;
    }

    public void setNext (SingleLinkedList nextNode)
    {
       next = nextNode;
    }
}
