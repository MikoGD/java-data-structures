package stack;

public class MainJava
{
    public static void main(String[] args)
    {
        Stack test_stack = new Stack();
        int data;

        test_stack.push(1);
        System.out.println(test_stack.peek_top());
        test_stack.push(2);
        test_stack.push(3);
        test_stack.push(4);
        System.out.println(test_stack.peek_top());
        while(test_stack.is_empty() != true)
        {
            data = test_stack.pop();
            System.out.println(data);
        }// END WHILE
    }// END main()
}// END CLASS Main()