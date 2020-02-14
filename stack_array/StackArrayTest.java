package stack_array;

public class StackArrayTest
{
    public static void main(String[] args)
    {
        StackArray stack = new StackArray(10);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i;

        for (i = 0; i < nums.length; i++)
        {
            stack.push(nums[i]);
        }// END FOR

        stack.display_stack();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.display_stack();
        stack.push(12);
        stack.push(15);
        stack.display_stack();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.display_stack();
    }// END main()
}// END CLASS StackArrayTest