package data_structures.sorted_linked_list;

public class Main
{
    public static void main(String[] args)
    {
        SortedLinkedList sll = new SortedLinkedList();

        sll.insert(2);
        sll.insert(3);
        sll.insert(1);
        sll.insert(4);

        sll.display();
        
        try
        {
            sll.remove(1);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }// END TRY

        sll.display();
    }// END main()
}