package stack;

public class Stack {
    private Node top = new Node();

    Stack()
    {
        this.top = null;
    }// END CONSTRUCTOR Stack()

    private class Node
    {
        int data;
        Node next_node;
    }// END CLASS Node

    public void push(int data)
    {
        Node temp = new Node();

        temp.data = data;
        temp.next_node = this.top;
        this.top = temp;
    }// END IF

    public int pop()
    {
        int data;

        if (is_empty() == true)
        {
            throw new IllegalStateException();
        }// END pop()

        data = this.top.data;
        this.top = this.top.next_node;
        return data;
    }// END pop()

    public boolean is_empty()
    {
        if (this.top == null)
        {
            return true;
        }// END IF

        return false;
    }// END is_empty()

    public int peek_top()
    {
        if (is_empty() == true)
        {
            System.out.println("Stack is empty");
            return -1;
        }// END IF

        return this.top.data;
    }// END peek_top()

    public boolean is_member(int data)
    {
        if (this.is_empty() == true)
        {
            throw new IllegalStateException();
        }// END IF

        if (this.peek_top() == this.top.data)
        {
            return true;
        }
        else
        {
            Node temp = this.top;

            while (temp.next_node != null)
            {
                if (temp.data == data)
                {
                    return true;
                }
                else
                {
                    temp = temp.next_node;
                }// END INNER IF
            }// END WHILE

            return false;
        }// END IF
    }// END is_member()
}// END CLASS StackImplementatino