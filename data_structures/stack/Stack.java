package data_structures.stack;

public class Stack<Data>
{
    ///////////////////////////////////////////////////////
    // PRIVATE CLASSES
    /** A class which creates nodes for linked lists
     */
    private class Node
    {
        Data data;
        Node next_node;
    }// END CLASS Node

    ///////////////////////////////////////////////////////
    // ATTRIBUTES
    /** Repressents the top of a stack
     */
    private Node top;

    ///////////////////////////////////////////////////////
    // CONSTRUCTOR
    /**Creates the top of the stack with an empty node */
    public Stack()
    {
        this.top = null;
    }// END CONSTRUCTOR Stack()

    ////////////////////////////////////////////////////////
    // PUBLIC METHODS
    /**Pushes data on top of the stack 
     * @param Data - The data that is pushed to the top.
    */
    public void push(Data data)
    {
        Node temp = new Node();

        temp.data = data;
        temp.next_node = this.top;
        this.top = temp;
    }// END IF

    /**Pops data on top of the stack
     * @exception StackException - Throws an exception if trying to pop an empty stack 
    */
    public Data pop() throws StackException
    {
        Data data;

        if (is_empty() == true)
        {
            throw new StackException(
                "\nIllegal pop() as the stack is empty\n"
            );
        }// END pop()

        data = this.top.data;
        this.top = this.top.next_node;
        return data;
    }// END pop()

    /**Checks if the stack is empty
     * @return Boolean - if the stack is empty return true else false.
     */
    public boolean is_empty()
    {
        if (this.top == null)
        {
            return true;
        }// END IF

        return false;
    }// END is_empty()

    /**Checks the data on the top of stack and returns it without 
     * popping the stack
     * @return Data -  The value at the top of stack
     * @exception StackException - Throws exception when the stack is empty
    */
    public Data peek_top() throws StackException
    {
        if (is_empty() == true)
        {
            throw new StackException(
                "Illegal peek_top() as the stack is empty"
            );
        }// END IF

        return this.top.data;
    }// END peek_top()

    /**
     * Checks if the data is a member of the stack.
     * 
     * @return Boolean -  If it is a member return true else return false
     * @throws StackException - If the stack is empty
     */
    public boolean is_member(Data data) throws StackException
    {
        if (this.is_empty() == true)
        {
            throw new StackException(
                "Illegal is_member() as the stack is empty"
            );
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

class StackException extends Exception
{
    private static final long serialVersionUID = -7674691844707876142L;

    /**Constructor that takes in a message to be used in super class
     * @param String - Message to be sent
    */
    public StackException(String message)
    {
        super(message);
    }// END CONSTRUCTOR
}// END CLASS StackException
