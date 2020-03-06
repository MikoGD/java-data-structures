package data_structures.circular_buffer;

class QueueException extends Exception
{
    static final long serialVersionUID = 1L;

    QueueException(String message)
    {
        super(message);
    }// END CONSTRUCTOR
}// END CLASS QueueException

public class CircularBuffer
{
    int size, max_capacity;
    int head, tail;
    int[] queue;

    public CircularBuffer(int max_capacity)
    {
        this.max_capacity = max_capacity;
        this.queue = new int[this.max_capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }// END CONSTRUCTOR

    public boolean is_empty()
    {
        return this.size == 0;
    }// END is_empty()

    public void enqueue(int data) throws QueueException
    {
        if (this.size == this.max_capacity)
        {
            throw new QueueException(
                "\nIllegal enqueue as the queue is full\n"
            );
        }// END IF

        this.queue[this.tail] = data;
        this.tail = (this.tail + 1) % this.max_capacity;
        this.size++;
    }// END enqueue()

    public int dequeue() throws QueueException
    {
        int data;

        if (is_empty() == true)
        {
            throw new QueueException(
                "\nIllegal dequeue as the queue is empty\n"
            );
        }// END IF

        data = this.queue[this.head];
        this.queue[this.head] = -1;
        this.head = (this.head + 1) % this.max_capacity;
        this.size--;

        return data;
    }// END dequeue()

    public void display()
    {
        if (is_empty() == true)
        {
            System.out.println("Queue is empty");
        }// END IF

        for(int i = 0; i < this.max_capacity; i++)
        {
            System.out.printf("%d, ", this.queue[i]);
        }
        
        System.out.println("");
    }// END display()
}// END CLASS CircularBuffer