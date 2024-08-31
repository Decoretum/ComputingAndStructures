package Structures.LinkedList;

public class CircularLinkedList extends SingleLinkedList {
    CircularLinkedList endNode;

    public CircularLinkedList(int val) {
        super(val);
        endNode = this;
    }

    public void appendNode(int val)
    {
        CircularLinkedList currNode = this;
        CircularLinkedList beginningNode = this;
        while (currNode != null)
        {   
            if (currNode.getNext() == null)
            break;

            currNode = (CircularLinkedList) currNode.getNext();
        }
        CircularLinkedList newNode = new CircularLinkedList(val);
        currNode.setNext(newNode);
        endNode = newNode;
        endNode.setNext(beginningNode);
    }

    public void printList()
    {
        CircularLinkedList currNode = this;
        while (currNode != null)
        {
            System.out.println(currNode.value);
            if (endNode == (CircularLinkedList) currNode.getNext())
            break;

            if (currNode.getNext() != null)
            System.out.print(currNode.value + " -> ");

            else
            System.out.print(currNode.value);

            currNode = (CircularLinkedList) currNode.getNext();
        }
    }
    
}
