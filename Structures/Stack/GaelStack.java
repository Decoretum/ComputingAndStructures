package Structures.Stack;
import java.util.*;

public class GaelStack {
    int max;
    ArrayList<Object> myStack;

    public GaelStack(int maxElements){
        max = maxElements;
        myStack = new ArrayList<>();
    }

    public boolean isEmpty()
    {
        return myStack.isEmpty();
    }

    public boolean isFull()
    {
        return myStack.size() == max;
    }

    public int stackSize()
    {
        return myStack.size();
    }

    public void push(Object val)
    {
        if (isFull() == false)
        myStack.add(0, val);

        else
        System.out.println("Stack with size " + max + " is full");
    }

    public Object pop()
    {
        if (isEmpty() == false)
        {
            Object removed = myStack.remove(0);
            return removed;
        } else {
            System.out.println("The Stack is still empty!");
        }
        
        return null;    
    }

    public Object peek()
    {
        if (isEmpty() == false)
        return (Object) myStack.get(0);

        else
        return null;
    }
    
}
