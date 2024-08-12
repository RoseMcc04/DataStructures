package Java.Queues;

/**
 * @author Rose Adrianna
 * @version 2024
 * @param T Generic type for Linked List
 */
public class LinkedList<T>
{
    private Node<T> head;

    /**
     * @return This method returns the string representation of the generic 
     * LinkedList object. 
     */
    public String toString() 
    {
        Node<T> cursor = head;
        String s = "<";
        while (cursor != null) 
        {
            s += cursor.getData();
            if (cursor.getNextLink() != null) 
            {
                s += ", ";
            }
            cursor = cursor.getNextLink();
        }
        s += ">";
        return s;
    }

    /**
     * This no-arg constructor allows us to initialize a generic LinkedList
     * object. 
     */
    public LinkedList() 
    {
        this.head = null;
    }

    /**
     * @param head Head to the generic LinkedList object
     * This one-arg constructor allows us to initialize a generic LinkedList
     * object along with a head to the list. 
     */
    public LinkedList(Node<T> head) 
    {
        this.head = head;
    }

    /**
     * @param data Data value being added to the generic LinkedList object
     * This method will allow us to add to the head of the linked list with 
     * a data value alongside it. 
     */
    public void addToHead(T data) 
    {
        Node<T> newHead = new Node<T>(data);
        if (head == null) 
        {
            head = newHead;
        }
        else 
        {
            newHead.setNextLink(head);
            head = newHead;
        }
    }

    /**
     * @param data Data value being added to the generic LinkedList object
     * This method will allow us to add to the tail of the linked list with
     * a data value alongside it. 
     */
    public void addToTail(T data) 
    {
        Node<T> tail = head;
        if (tail == null) 
        {
            this.head = new Node<T>(data);
        }
        else 
        {
            while (tail.getNextLink() != null) 
            {
                tail = tail.getNextLink();
            }
            tail.setNextLink(new Node<T>(data));
        }
    }

    /**
     * This method removes the head of the generic LinkedList object and 
     * the next node becomes the new head. 
     */
    public void removeHead() 
    {
        Node<T> removedHead = head;
        if (removedHead == null) 
        {
            return;
        }
        head = head.getNextLink();
    }
}
