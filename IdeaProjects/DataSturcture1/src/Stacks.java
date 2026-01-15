public class Stacks {
    public int maxSize ;
    public int top ;
    public int [] elements;

    public Stacks(int size)
    {
        top = -1; // outside the array
        maxSize = size ;
        elements = new int [size];
    }
    public boolean IsEmpty()
    {
        return top == -1;
    }
    public boolean IsFull()
    {
        return top == maxSize - 1;
    }
    public void Push(int item)
    {
        if (IsFull())
        {
            System.out.println("Stack overflow ! Can not add items");
        }
        else
        {
            elements[++top] = item;
            System.out.println("The Item " + item + " added to the stack");
        }
    }
    public int Pop()
    {
        if (IsEmpty())
        {
            System.out.println("The Stack is Underflow !");
            return -1;
        }
        else
        {
            int poppedvalue = elements[top--];
            return poppedvalue;
        }
    }
    public int top()
    {
        if (IsEmpty())
        {
            System.out.println("The Stack is Empty");
            return -1 ;
        }
        else
        {
            return elements[top];
        }
    }
    public void Display()
    {
        for (int i=0 ; i<maxSize ; i++)
        {
            System.out.println(elements[i]);
        }

    }

}
