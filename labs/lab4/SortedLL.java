// Sorted linked list with a sentinel node
// Skeleton code
package labs.lab4;

import java.util.Scanner;

class SortedLL
{
    // internal data structure and
    // constructor code to be added here
    private class Node
    {
        int data;
        Node next_node;
    }// END CLASS Node

    Node head, sentinel;

    public SortedLL()
    {
        this.sentinel = new Node();
        this.sentinel.next_node = this.sentinel;
        this.head = this.sentinel;
    }// END CONSTRUCTOR
    
    // this is the crucial method
    public void insert(int x)
    {
        Node prev, curr, t;
          
        t = new Node();
        t.data = x;
        this.sentinel.data = x;

        prev = null;
        curr = this.head;

        while (curr.data < x)
        {
            prev = curr;
            curr = curr.next_node;
        }// END WHILE

        t.next_node = curr;

        if (prev == null)
        {
            this.head = t;
        }
        else
        {
            prev.next_node = t;
        }// END IF
    }// END insert()
    
    public boolean remove(int x) {
        Node prev, curr;
        Node temp;
        
        curr = this.head;
        prev = null;

        this.sentinel.data = x + 1;

        while (curr.data < x)
        {
            prev = curr;
            curr = curr.next_node;
        }// END WHILE

        if (curr.data > x)
        {
            return false;
        }// END IF

        if (prev == null)
        {
            head = curr.next_node;
        }
        else
        {
            prev.next_node = curr.next_node;
        }// END IF

        return true;
    }// END remove()
    
    public boolean isEmpty() {
        return this.head == this.sentinel;
    }
    
    public void display()
    {
        Node t = head;
        System.out.print("\nHead -> ");
        while( t != this.sentinel) {
            System.out.print(t.data + " -> ");
            t = t.next_node;
        }
        System.out.println("Z\n");
    }
    
    public static void main(String args[])   
    {
        SortedLL list = new SortedLL();
        //list.display();
        
        double x;
        int i, r;
        
           for(i = 1; i <= 5; ++i)  {
           x =  (Math.random()*100.0);
           r = (int) x; 
           System.out.println("Inserting " + r);
           list.insert(r);
           list.display();            
        }
        
        while(!list.isEmpty())  {
            System.out.println("\nInput a value to remove: ");
            Scanner in = new Scanner(System.in);
            r = in.nextInt();
            if(list.remove(r)) {
                System.out.println("\nSuccessfully removed: " + r);
            list.display(); }
            else System.out.println("\nValue not in list");                        
        }
    }
}