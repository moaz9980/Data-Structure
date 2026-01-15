
public class Array{
    int [] arr;
    int ItemCounter ;
    Array(int size) // constructor
    {
        ItemCounter =0;
        arr= new int[size];

    }
    boolean isFull()
    {
        if (ItemCounter == arr.length)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }

    void append(int item)
    {
        if (isFull())
        {
            System.out.println("Array is full");
        }
        else
        {
            arr[ItemCounter++] = item;
        }

    }
    void Traverse()
    {
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }

    }
    void Traverse2()
    {
        for (int i=0 ; i<ItemCounter ; i++)
        {
            System.out.println(arr[i] + " is found at index : " + i);
        }
//        for(int i : arr) i can not control the index with for each loop
//        {
//            System.out.println(i);
//        }
    }
    void search(int item)
    {
        for (int i=0 ; i<ItemCounter ; i++)
        {
            if (arr[i] == item)
            {
                System.out.println("Item is found at index : " + i);
                return;
            }
        }
        System.out.println("Item is not found ");
    }
    void insert(int item , int pos)
    {
        if(isFull())
        {
            System.out.println("Array is full");
            return;
        }
        for (int i=ItemCounter ; i>pos ; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos] = item;

        ItemCounter++;
    }
    void Delete(int pos)
    {
        for (int i=pos ; i<ItemCounter - 1 ; i++)
        {
            arr[i] = arr[i+1] ;
        }
    }


}