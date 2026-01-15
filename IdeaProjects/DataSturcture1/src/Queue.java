public class Queue {
    private int element [];
    private int front ;
    private int rear ;
    private int sizes;

    public Queue (int sizes)
    {
         element = new int [sizes];
         front = -1 ;
         rear = -1 ;
         this.sizes = sizes;


    }
    public boolean isFull()
    {
        return rear == sizes -1 ;
    }
    public boolean isEmpty()
    {
        return front > rear || front == -1;
    }
    public void enqueue (int item)
    {
        if (isFull())
        {
            System.out.println("Queue Overflow !");
        }
        else
        {
            element[++rear] = item;
            System.out.println("The item " + item + " added to the queue");
        }
    }

}
