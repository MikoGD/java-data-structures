package data_structures.sorted_linked_list;

public class SortedLinkedList
{
    private class Node
    {
        int data;
        Node next_node;
    }// END CLASS Node

    Node head;

    public SortedLinkedList()
    {
        this.head = null;
    }// END CONSTRUCTOR

    public void insert(int data)
    {
        Node prev, curr;
        Node new_node = new Node();

        new_node.data = data;
        new_node.next_node = null;

        curr = this.head;
        prev = null;

        if (curr == null)
        {
            this.head = new_node;
            return;
        }// END IF

        while (curr.data < data)
        {
            prev = curr;
            curr = curr.next_node;
            
            if(curr == null)
            {
                break;
            }// END IF
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

        if (curr.data == data)
        {
            temp = curr;
            this.head = curr.next_node;
            return temp.data;
        }// END IF

        while (curr.data != data)
        {
            prev = curr;
            curr = curr.next_node;

            if(curr == null)
            {
                break;
            }// END IF
        }// END WHILE

        if (curr == null)
        {
            throw new IllegalStateException("data not in linked list");
        }
        else
        {
            temp = curr;
            prev.next_node = curr.next_node;
            return temp.data;
        }// END IF
    }// END remove()

    public void display()
    {
        Node curr = this.head;

        while (curr != null)
        {
            System.out.printf("%d ", curr.data);
            curr = curr.next_node;

            if (curr != null)
            {
                System.out.printf("-> ");
            }// END IF
        }// END WHILE
        
        System.out.println("");
    }// END display()
}// END CLASS SortedLinkedList