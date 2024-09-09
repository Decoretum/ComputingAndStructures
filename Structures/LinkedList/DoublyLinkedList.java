package Structures.LinkedList;

import java.util.Stack;

public class DoublyLinkedList {
    Integer value;
    DoublyLinkedList next;
    DoublyLinkedList back;
    DoublyLinkedList end;

    public DoublyLinkedList (int val) {
        value = val;
        setNext(null);
        setBack(null);
        setEnd(null);
    }

    //Append node 
    //insert node at the last value of the linked list
    public void appendNode(int val)
    {
        DoublyLinkedList currNode = this;
        while (currNode != null)
        {   
            if (currNode.getNext() == null)
            break;

            currNode = currNode.getNext();
        }
        DoublyLinkedList newNode = new DoublyLinkedList(val);
        currNode.setNext(newNode);
        newNode.setBack(currNode);
        setEnd(newNode);
    }

    //Insert node at a specific position
    public void insertNode(int position, int val)
    {
        int counter = 0;
        DoublyLinkedList currNode = this;
        DoublyLinkedList backNode = null;
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
            DoublyLinkedList newNode = new DoublyLinkedList(val);
            DoublyLinkedList nextNode = currNode.getNext();

            backNode.setNext(newNode);

            newNode.setNext(currNode);
            newNode.setBack(backNode);

            currNode.setNext(nextNode);
            currNode.setBack(newNode);
        }
    }

    //update node at position
    public void updateNode (int position, int newValue)
    {
        DoublyLinkedList currNode = this;

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
        DoublyLinkedList currNode = this;
        DoublyLinkedList backNode = null;
        while(currNode != null)
        {
            if (counter == position || currNode.getNext() == null)
            break;

            backNode = currNode;
            currNode = currNode.getNext();
            counter++;
        }

        if (counter < position)      
        {
            backNode.setNext(null);
            setEnd(backNode);
        }

        else if (backNode == null)
        this.value = null;

        else {
            if (currNode.getNext() == null)
            {
                backNode.setNext(null);
                setEnd(backNode);
            }

            else {
                DoublyLinkedList newNext = currNode.getNext();
                backNode.setNext(newNext);
                newNext.setBack(backNode);
            }
        }
    }

    public void printList()
    {
        DoublyLinkedList currNode = this;
        while (currNode != null)
        {
            if (currNode.getNext() != null)
            System.out.print(currNode.value + " -> ");

            else
            System.out.print(currNode.value);

            currNode = currNode.getNext();
        }
        System.out.println();
    }

    public void firstKNodes(DoublyLinkedList LL, int numNodes)
    {
        System.out.println("First " + numNodes + " Nodes");
        int c = 0;
        DoublyLinkedList currNode = this;
        while (currNode != null)
        {
            if (c == numNodes)
            break;

            else if (currNode.getNext() != null && c + 1 != numNodes)
            System.out.print(currNode.value + " -> ");

            else
            System.out.print(currNode.value);

            currNode = currNode.getNext();
            c++;
        }
    }

    public void lastKNodes(DoublyLinkedList LL, int numNodes)
    {
        System.out.println("Last " + numNodes + " Nodes");
        DoublyLinkedList currNode = getEnd();
        int c = 0;
        Stack<Integer> s = new Stack<>();

        //Start Printing
        //  1 1 1 1 1 - last 3
        // ideally: if (length of linkedlist - index) <= numNodes
        // This will result to O(n * k) wherein n is the number of elements, 
        // and k is the iteration over all elements again done for each n 
        
        //Better way is to reach the end and start from there

        while(c < numNodes)
        {   
            if (c == numNodes)
            break;
            
            s.push(currNode.value);
            currNode = currNode.getBack();
            c++;
        }

        while(!s.isEmpty())
        {
            int val = s.pop();

            if (s.size() == 0)
            System.out.print(val);

            else
            System.out.print(val + " -> ");
        }
    }

    public DoublyLinkedList getNext ()
    {
        return next;
    }

    public void setNext (DoublyLinkedList nextNode)
    {
       next = nextNode;
    }   

    public void setBack(DoublyLinkedList backNode)
    {
        back = backNode;
    }

    public DoublyLinkedList getBack()
    {
        return back;
    }

    public void setEnd (DoublyLinkedList endNode)
    {
        end = endNode;
    }

    public DoublyLinkedList getEnd ()
    {
        return end;
    }
}
