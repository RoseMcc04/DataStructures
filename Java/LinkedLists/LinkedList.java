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
     * @throws NullPointerException This exception happens if the head of the
     * generic LinkedList object is null. 
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
        newHead.setLink(head);
        head = head.getLink();
        newHead = head;
    }
}
