package data_structures.stack;

public class MainJava
{
    public static void main(String[] args)
    {
        Stack<Integer> test_stack = new Stack<Integer>();
        int data;

        try
        {
            test_stack.pop();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        /*
        test_stack.push(1);
        test_stack.push(2);
        test_stack.push(3);
        test_stack.push(4);

        try 
        {
            System.out.println(test_stack.is_member(1));
            System.out.println(test_stack.is_member(4));
            System.out.println(test_stack.is_member(3));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }// END TRY

        while(test_stack.is_empty() != true)
        {
            try
            {
                data = test_stack.pop();
                System.out.println(data);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }// END TRY
        }// END WHILE
        */
    }// END main()
}// END CLASS Main()