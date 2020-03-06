// StackTest.java
// Linked list implementation of Stack
package labs.lab1;

class Stack {
    class Node {
        int data;
        Node next;  
    }
    private Node top;
      
    public Stack()
    { 
        top = null;
    }
        
    public void push(int x) {
        Node  t = new Node();
        t.data = x;
        t.next = top;
        top = t;
    }

    // pop() method here
    // only to be called if list is non-empty.
    // Otherwise an exception should be thrown.
    public int pop() throws IllegalStateException
    {
        Node temp;

        if (this.top == null)
        {
            throw new IllegalStateException("Stack is empty");
        }// END IF

        temp = this.top;
        this.top = this.top.next;
        return temp.data;
    }// END pop();

    public boolean isMember(int x)
    {
        Node curr;

        if (this.top == null)
        {
            return false;
        }// END FI

        curr = this.top;

        while (curr != null)
        {
            if (curr.data == x)
            {
                return true;
            }// END IF

            curr = curr.next;
        }// END WHILE

        return false;
    }// END isMember()

    public int getSize()
    {
        Node curr = this.top;
        int size = 0;

        while (curr != null)
        {
            size++;
            curr = curr.next;
        }// END WHILE

        return size;
    }// END getSize()

    public void display() {
        Node t = top;
        //Console.Write("\nStack contents are:  ");
        System.out.println("\nStack contents are:  ");
        
        while (t != null) {
            //Console.Write("{0} ", t.data);
            System.out.print(t.data + " ");
            t = t.next;
        }
        //Console.Write("\n");
        System.out.println("\n");
    }

}


public class StackTest
{
    public static void main( String[] arg){
        Stack s = new Stack();
        //Console.Write("Stack is created\n");
        System.out.println("Stack is created\n");
        
        s.push(10); s.push(3); s.push(11); s.push(7);
        System.out.println("The size the stack is " + s.getSize());
        s.display();
        
        int i = s.pop();
        
        //Console.Write("\nJust popped {0}", i);
        System.out.println("Just popped " + i);
        s.display();

        System.out.println("Is " + 11 + " a member? Ans: " + s.isMember(11));
        System.out.println("Is " + 3 + " a member? Ans: " + s.isMember(3));
        System.out.println("Is " + 10 + " a member? Ans: " + s.isMember(10));
        System.out.println("Is " + 5 + " a member? Ans: " + s.isMember(5));
        System.out.println("The size the stack is " + s.getSize());
    }
}