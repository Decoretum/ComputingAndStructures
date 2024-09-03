package Structures.LinkedList;

public class CircularLinkedList {
    Integer value;
    CircularLinkedList end;
    CircularLinkedList next;


    public CircularLinkedList(int val) {
        value = val;
        setNext(null);
        setEnd(null);
    }

    public void appendNode(int val)
    {
        CircularLinkedList currNode = this;
        while (currNode != null)
        {   
            if (currNode.getNext() == null)
            break;

            currNode = (CircularLinkedList) currNode.getNext();
        }
        CircularLinkedList newNode = new CircularLinkedList(val);
        currNode.setNext(newNode);
        setEnd(newNode);
        newNode.setNext(this); //Cause of problem in this function
    }

    //Insert node at a specific position
    public void insertNode(int position, int val)
    {
        int counter = 0;
        CircularLinkedList currNode = this;
        CircularLinkedList backNode = null;
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
            CircularLinkedList newNode = new CircularLinkedList(val);
            CircularLinkedList nextNode = currNode.getNext();
            backNode.setNext(newNode);
            newNode.setNext(currNode);
            currNode.setNext(nextNode);
        }
    }

    //update node at position
    public void updateNode (int position, int newValue)
    {
        CircularLinkedList currNode = this;

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
        CircularLinkedList currNode = this;
        CircularLinkedList backNode = null;
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
        CircularLinkedList currNode = this;
        while (currNode != null)
        {
            System.out.println(currNode.value);
            if (end == (CircularLinkedList) currNode.getNext())
            break;

            if (currNode.getNext() != null)
            System.out.print(currNode.value + " -> ");

            else
            System.out.print(currNode.value);

            currNode = (CircularLinkedList) currNode.getNext();
        }
    }

    public CircularLinkedList getNext ()
    {
        return next;
    }

    public void setNext (CircularLinkedList nextNode)
    {
       next = nextNode;
    }

    public void setEnd (CircularLinkedList endNode)
    {
        end = endNode;
    }
    
}
