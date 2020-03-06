package data_structures.queue;

class StackException extends Exception
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    StackException(String message)
    {
        super(message);
    }// END CONSTRUCTOR StackException()
}

public class Queue
{
    /**A class to create a node of a linked list*/
    private class Node
    {
        int data;
        Node next_node;
    }// END CLASS Node

    /**Represents the head and tail of a queue*/
    private Node head, tail, z;

    /**Assigns the head and tail to be null*/
    public Queue()
    {
        this.head = null;
        this.tail = null;
        this.z = new Node();
        z.next_node = this.z;
    }// END CONSTRUCTOR Queue()

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty.
     * @return false if the queue is not empty.
    */
    public boolean is_empty()
    {
        if (this.head == null)
        {
            return true;
        }// END IF

        return false;
    }// END is_empty()

    /**
     * Adds a node to the queue
     * @param data the data we want to add to the queue
     */
    public void enqueue(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next_node = null;

        if (this.is_empty() == true)
        {
            this.head = temp;
            this.tail = temp;
            this.tail.next_node = this.z;
        }
        else
        {
            this.tail.next_node = temp;
            this.tail = temp;
            this.tail.next_node = this.z;
        }// END IF
    }// END enque()

    /**
     * Removes a node from the queue.
     * @return the integer data which was contained in the node.
     * @exception when the queue is empty throw an exception.
     */
    public int dequeue() throws StackException
    {
        int data;
    
        if (this.is_empty() == true)
        {
            throw new StackException(
                "\nIllegeal dequeue as the stack is empty\n"
            );
        }// END IF

        data = this.head.data;
        this.head = this.head.next_node;

        return data;
    }// END deque()

    /**
     * Checks whether the data parameter is in the queue.
     * @return true if the data is in the queue.
     * @return false if the data is not in the queue.
     */
    public boolean is_member(int data)
    {
        Node temp = new Node();
        temp = this.head;

        if (this.is_empty() == true)
        {
            return false;
        }// END IF

        do
        {
            if (data == temp.data)
            {
                return true;
            }// END IF

            temp = temp.next_node;    
        }//END DO
        while (temp != this.z);

        return false;
    }// END is_member()

    /**
     * Displays the queue in the terminal.
     */
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
            while(temp != this.z);

            System.out.println("\n");
        }// END IF
    }// END display_queue;
}// END CLASS Queue