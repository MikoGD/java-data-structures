package heap;

public class Main
{
    public static void main(String[] args)
    {
        int i;
        Heap my_heap = new Heap(10);
        int[] nums = {10, 9, 6, 4, 11, 12};

        for (i = 0; i < nums.length; i++)
        {
            my_heap.add(nums[i]);
        }// END FOR

        my_heap.print_heap();
    }// END main()
}// END CLASS Main