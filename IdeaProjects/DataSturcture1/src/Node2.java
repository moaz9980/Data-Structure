public class Node2{
    int data;
    Node2 next ;
    Node2 prev;
    Node2(int data) // Constuctor that make it easy for creating nodes
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubleLinkedList{
    Node2 head ;
    // Insert at the end
    public void Append(int data)
    {
        Node2 newnode = new Node2(data);
        if (head == null)
        {
            head = newnode;
            return;
        }
        Node2 current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newnode;
        newnode.prev = current;
    }

    public void InsertAtPostion(int data, int pos)
    {
        Node2 newnode = new Node2(data);
        if (pos == 0)
        {
            newnode.next = head;
            if (head != null)
            {
                head.prev = newnode;
            }
            head = newnode ;
            return;
        }
        int index = 0;
        Node2 current = head;
        while (current != null && index < pos -1 )
        {
            current  = current.next;
            index ++ ;
        }
        if (current == null)
        {
            System.out.println ("The Position is out of bonds");
            return;
        }
        newnode.next = current.next;
        newnode.prev = current;
        if (current.next != null)
        {
            current.next.prev = newnode;
        }
        current.next = newnode;

    }
    public void Delete(int item)
    {
        if (head == null)
        {
            System.out.println("The Linkedlist is empty");
            return;
        }
        Node2 current = head;
        if (current.data == item)
        {
            if (current.next == null) // Only one node
            {
                head = null;
            }
            else
            {
                head = current.next;
                current.prev = null;
            }
            return;
        }
        // If the item in the middle of the list
        while (current != null)
        {
            if (current.data == item)
            {
                current.prev.next = current.next;
                if (current.next !=null)
                {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("The item " + item + "isNot found");
    }
    public void Traverse()
    {
        if (head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node2 current = head;
        System.out.print("List: ");
        while (current != null)
        {
            System.out.print(current.data);
            if (current.next != null)
            {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

}
