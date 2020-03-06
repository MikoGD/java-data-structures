package data_structures.heap;

import java.util.Arrays;

public class Heap
{
    int size;
    int max_capacity;
    int[] heap_int;

    public Heap(int size)
    {
        max_capacity = size;
        this.size = 0;
        heap_int = new int[size];
    }// END CONSTRUCTOR Heap()

    private int get_parent_index(int index) {return (index - 1) / 2;}//END get_parent_index()
    private int get_left_child_index(int index) {return (index * 2) + 1;}// END get_left_child_index()
    private int get_right_child_index(int index) {return (index * 2) + 1;}// END get_right_child_index()

    private boolean has_parent(int index) {return get_parent_index(index) > 0;}// END has_parent()
    private boolean has_left_child(int index) {return get_left_child_index(index) < this.size;}// END has_left_child()
    private boolean has_right_child(int index) {return get_right_child_index(index) < this.size;}// END has_right_chidl()

    //private int get_parent(int index) {return this.heap_int[get_parent_index(index)];}// END get_parent()
    private int get_left_child(int index) {return this.heap_int[get_left_child_index(index)];}// END get_left_child()
    private int get_right_child(int index) {return this.heap_int[get_right_child_index(index)];}// END get_right_child()

    private void ensure_capacity()
    {
        if (size < max_capacity)
        {
            heap_int = Arrays.copyOf(heap_int, max_capacity * 2);
        }// END IF
    }// END increase_capacity()

    private void swap(int index_1, int index_2)
    {
        int temp = this.heap_int[index_1];
        this.heap_int[index_1] = this.heap_int[index_2];
        this.heap_int[index_2] = temp;
    }// END swap()

    private void heapify_up()
    {
        int index = size - 1;

        while (
            (has_parent(index) && heap_int[get_parent_index(index)] > heap_int[index])
            || (index == 1 && heap_int[index] < heap_int[0]))
            {
                swap(get_parent_index(index), index);
                index = get_parent_index(index);
            }// END WHILE
    }// END heapify_up()

    private void heapify_down()
    {
        int index = 0;
        int smallest_child_index;

        while (has_left_child(index))
        {
            smallest_child_index = get_left_child_index(index);

            if (has_right_child(index) && get_right_child(index) > get_left_child(index))
            {
                smallest_child_index = get_right_child_index(index);
            }// END IF

            if (this.heap_int[index] > this.heap_int[smallest_child_index])
            {
                swap(index, smallest_child_index);
            }
            else
            {
                break;
            }// END IF

            index = smallest_child_index;
        }// END WHILE
    }// END heapify_down()

    public void add(int data)
    {
        ensure_capacity();
        heap_int[size] = data;
        size++;
        heapify_up();
    }// END add()

    public int poll()
    {
        int data;

        if (this.size == 0) throw new IllegalStateException();

        data = this.heap_int[0];
        this.heap_int[0] = this.heap_int[this.size - 1];
        this.size--;
        heapify_down();

        return data;
    }// END poll()

    public int peek()
    {
        if (this.size == 0) throw new IllegalStateException();

        return this.heap_int[0];
    }// END peek();

    public void print_heap()
    {
        int i;

        for (i = 0; i < this.size; i++)
        {
            System.out.printf("%d ", heap_int[i]);
        }// END FOR

        System.out.println("");
    }// END print_heap()
}// END CLASS Heap