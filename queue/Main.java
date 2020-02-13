package queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue queue_int = new Queue();
        queue_int.enqueue(5);
        queue_int.enqueue(2);
        queue_int.enqueue(7);
        queue_int.enqueue(5);
        queue_int.enqueue(1);
        queue_int.enqueue(6);
        queue_int.display_queue();
        System.out.println(queue_int.is_member(5) + "\n");
        System.out.println(queue_int.is_member(7) + "\n");
        System.out.println(queue_int.is_member(6) + "\n");
        System.out.println(queue_int.is_member(3) + "\n");

        queue_int.dequeue();
        queue_int.dequeue();
        queue_int.display_queue();

        queue_int.enqueue(8);
        queue_int.enqueue(9);
        queue_int.display_queue();
    }// END main()
}// END CLASS Main