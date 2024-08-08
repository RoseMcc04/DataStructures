package Java.LinkedLists;

/**
 * @author Rose McCormack
 * @version 2024
 * @param T Generic type for LinkedList class
 */
public class LinkedList<T>
{
    private Node<T> head;

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
            newHead.setLink(head);
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
            while (tail.getLink() != null) 
            {
                tail = tail.getLink();
            }
            tail.setLink(new Node<T>(data));
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
        head = head.getLink();
    }

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
            if (cursor.getLink() != null) 
            {
                s += ", ";
            }
            cursor = cursor.getLink();
        }
        s += ">";
        return s;
    }
}
