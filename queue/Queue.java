package queue;

public class Queue
{
    private class Node
    {
        int data;
        Node next_node;
    }// END CLASS Node

    private Node head, tail;

    public Queue()
    {
        this.tail = new Node();
        this.head = null;
        this.tail = null;
    }// END CONSTRUCTOR Queue()

    public boolean is_empty()
    {
        if (this.head == null)
        {
            return true;
        }// END IF

        return false;
    }// END is_empty()

    public void enqueue(int data)
    {
        Node temp = new Node();

        if (this.is_empty() == true)
        {
            this.head = new Node();

            temp.data = data;
            temp.next_node = this.head.next_node;

            this.head = temp;
            this.tail = temp;
        }
        else
        {
            temp.data = data;
            temp.next_node = null;
            this.tail.next_node = temp;
            this.tail = temp;
        }// END IF
    }// END enque()

    public int dequeue()
    {
        int data;
    
        if (this.is_empty() == true)
        {
            throw new IllegalStateException();
        }// END IF

        data = this.head.data;
        this.head = this.head.next_node;

        return data;
    }// END deque()

    public boolean is_member(int data)
    {
        Node temp = new Node();

        if (this.is_empty() == true)
        {
            throw new IllegalStateException();
        }// END IF

        temp = this.head;

        do
        {
            if (data == temp.data)
            {
                return true;
            }// END IF

            temp = temp.next_node;    
        }//END DO
        while (temp != null);

        return false;
    }// END is_member()

    public void display_queue()
    {
        Node temp = new Node();

        if (this.is_empty() == true)
        {
            System.out.println("Queue empty");
        }
        else
        {
            temp = this.head;

            do
            {
                System.out.printf("%d, ", temp.data);
                temp = temp.next_node;
            }// END DO
            while(temp != null);

            System.out.println("\n");
        }// END IF
    }// END display_queue;
}// END CLASS Queue
