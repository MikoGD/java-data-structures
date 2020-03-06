package data_structures.sorted_linked_list;

public class SortedLinkedListWithSentinel
{
    private class Node
    {
        int data;
        Node next_node;
    }// END CLASS Node

    Node head, sentinel;

    public SortedLinkedListWithSentinel()
    {
        this.sentinel = new Node();
        this.sentinel.next_node = this.sentinel;
        this.head = sentinel;
    }// END CONSTRUCTOR

    public void insert(int data)
    {
        Node prev, curr;
        Node new_node = new Node();

        new_node.data = data;
        this.sentinel.data = data;
        prev = null;
        curr = this.head;

        while (curr.data < data)
        {
            prev = curr;
            curr = curr.next_node;
        }// END WHILE

        new_node.next_node = curr;

        if (prev == null)
        {
            this.head = new_node;
        }
        else
        {
            prev.next_node = new_node;
        }// END IF
    }// END insert()

    public int remove(int data) throws IllegalStateException
    {
        Node prev, curr, temp;

        curr = this.head;
        prev = null;
        
        this.sentinel.data = data + 1;

        while (curr.data < data)
        {
            prev = curr;
            curr = curr.next_node;
        }// END WHILE

        if (curr.data > data)
        {
            throw new IllegalStateException(
                "Data not in list"
            );
        }// END IF
        
        temp = curr;

        if (prev == null)
        {
            head = curr.next_node;
        }
        else
        {
            prev.next_node = curr.next_node;
        }// END IF

        return temp.data;
    }// END remove()

    public void display()
    {
        Node curr = this.head;

        while (curr != this.sentinel)
        {
            System.out.printf("%d ", curr.data);
            curr = curr.next_node;

            if (curr != this.sentinel)
            {
                System.out.printf("-> ");
            }// END IF
        }// END WHILE
        
        System.out.println("");
    }// END display()
}// END CLASS SortedLinkedList