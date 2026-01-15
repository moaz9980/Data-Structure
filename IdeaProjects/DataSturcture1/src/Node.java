public class Node{
    int data ;
    Node next ;
    public Node (int data)
    {
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedList{
    Node head ;

    public void InsertFirst(int item)
    {
        Node q = new Node(item);
        q.next = head ;
        head = q ;
    }
    public void Append(int item) // Insert
    {
        Node n = new Node(item);
        if (head == null)
        {
            head = n ;
        }
        else
        {
            Node current = head ;
            while (current.next != null)
            {
                current = current.next ;
            }
            current.next = n ;  // n refers to the node(item)
        }

    }
    public void Delete(int item)
    {
        if (head == null)
        {
            return;
        }

        if (head.data == item)
        {
            head = head.next;
            return;
        }

        Node current = head ;
        while (current.next != null)
        {
            if (current.next.data == item)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }
    public void InsertAtPostion(int item , int pos)
    {
        Node w = new Node(item);
        if (pos ==0)
        {
            InsertFirst(item); // reuse for the code that i right
            return;
        }
        Node current = head ;
        int index = 0 ;
        while (current != null && index < pos -1 )
        {
            current = current.next ;
            index ++ ;
        }
        if (current == null)
        {
            System.out.println("The System is out of bonds");
            return;
        }
        w.next = current.next;
        current.next = w ;




    }
    public void Traverse()
    {
        Node current = head ;
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
