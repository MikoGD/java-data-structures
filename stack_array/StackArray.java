package stack_array;

import java.util.Arrays;

public class StackArray
{
    int[] array;
    int max_capacity;
    int size = 0;

    public StackArray(int max_capacity)
    {
        this.max_capacity = max_capacity;
        this.array = new int[max_capacity];
    }// END CONSTRUCTOR StackArray()

    public boolean is_empty()
    {
        return this.size == 0 ? true : false;
    }// END is_empty()

    public boolean is_member(int data)
    {
        int index;

        if (this.size == 0)
        {
            return false;
        }// END IF

        for (index = 0; index < this.size; index++)
        {
            if (this.array[index] < data)
            {
                return true;
            }// END IF
        }// END FOR

        return false;
    }// END is_member()

    public void ensure_capacity()
    {
        if (this.size >= this.max_capacity)
        {
            this.array = Arrays.copyOf(this.array, this.max_capacity * 2);
        }// END IF
    }// END ensure_capacity()

    public void push(int data)
    {
        this.ensure_capacity();
        this.array[this.size] = data;
        this.size++;
    }// END push()

    public int pop()
    {
        if (this.is_empty() == true)
        {
            throw new IllegalStateException();
        }// END IF

        int data = this.array[size - 1];
        this.size--;
        
        return data;
    }// END pop()

    public void display_stack()
    {
        int i;

        for (i = 0; i < this.size; i++)
        {
            System.out.printf("%d, ", this.array[i]);
        }// END FOR

        System.out.println("");
    }// END display_stack()
}// END CLASS StackArray