package Java.HashMaps;

/**
 * @author Rose McCormack
 * @version 2024
 * @param K Generic type for keys
 * @param V Generic type for values
 */
public class LinkedList<K, V>
{
    private Node<K, V> head;

    /**
     * @return This method returns the keys of a generic HashMap.  
     */
    public String printKeys() 
    {
        Node<K, V> cursor = head;
        String s = "<";
        while (cursor != null) 
        {
            s += cursor.getKey();
            if (cursor.getLink() != null) 
            {
                s += ", ";
            }
            cursor = cursor.getLink();
        }
        s += ">";
        return s;
    }

    /**
     * @return This method returns the values of a generic Hashmap.
     */
    public String printValues() 
    {
        Node<K, V> cursor = head;
        String s = "<";
        while (cursor != null) 
        {
            s += cursor.getValue();
            if (cursor.getLink() != null) 
            {
                s += ", ";
            }
            cursor = cursor.getLink();
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
    public LinkedList(Node<K, V> head) 
    {
        this.head = head;
    }

    /**
     * @param data Data value being added to the generic LinkedList object
     * This method will allow us to add to the head of the linked list with 
     * a data value alongside it. 
     */
    public void addToHead(K key, V value) 
    {
        Node<K, V> newHead = new Node<K, V>(key, value);
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
    public void addToTail(K key, V value) 
    {
        Node<K, V> tail = head;
        if (tail == null) 
        {
            this.head = new Node<K, V>(key, value);
        }
        else 
        {
            while (tail.getLink() != null) 
            {
                tail = tail.getLink();
            }
            tail.setLink(new Node<K, V>(key, value));
        }
    }

    /**
     * This method removes the head of the generic LinkedList object and 
     * the next node becomes the new head. 
     */
    public void removeHead() 
    {
        Node<K, V> removedHead = head;
        if (removedHead == null) 
        {
            return;
        }
        head = head.getLink();
    }

    /**
     * @return This method returns the head of the generic Linked List. 
     */
    public Node<K, V> getHead() 
    {
        return this.head;
    }
}
