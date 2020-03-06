package data_structures.circular_buffer;

public class Main
{
    public static void main(String[] args)
    {
        CircularBuffer cb = new CircularBuffer(10);
        for (int i = 1; i < 11; i++)
        {
            try
            {
                cb.enqueue(i);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }// END TRY
        }// END FOR

        cb.display();

        try
        {
            cb.dequeue();
            cb.dequeue();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }// END TRY

        cb.display();

        try
        {
            cb.enqueue(20);
            cb.enqueue(123);
            cb.enqueue(12345);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }// END TRY

        cb.display();
    }// END main()
}// END CLASS Main