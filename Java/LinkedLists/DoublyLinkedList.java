package Java.LinkedLists;

/**
 * @author Rose McCormack
 * @version 2024
 * @param T Generic type used for DoublyLinkedList
 */
public class DoublyLinkedList<T>
{
    private Node<T> head;
    private Node<T> tail;

    /**
     * @return This method return the string representation of the Doubly
     * Linked List. 
     */
    public String toString() 
    {
        Node<T> cursor = this.head;
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
     * This is the no-arg constructor that initializes the generic Doubly
     * Linked List. 
     */
    public DoublyLinkedList() 
    {
        this.head = null;
        this.tail = null;
    }

    /**
     * @param data Data for node added
     * This method inputs a piece of data and adds the node as the head of 
     * the generic Doubly Linked List. 
     */
    public void addToHead(T data) 
    {
        Node<T> newHead = new Node<T>(data);
        Node<T> cursor = this.head;
        if (cursor != null) 
        {
            cursor.setPrevLink(newHead);
            newHead.setNextLink(cursor);
        }
        this.head = newHead;
        if (this.tail == null) 
        {
            this.tail = newHead;
        }
    }

    /**
     * @param data Data for node added
     * This method inputs a piece of data and adds the node as the tail of
     * the generic Doubly Linked List. 
     */
    public void addToTail(T data) 
    {
        Node<T> newTail = new Node<T>(data);
        Node<T> cursor = this.tail;
        if (cursor != null) 
        {
            cursor.setNextLink(newTail);
            newTail.setPrevLink(cursor);
        }
        this.tail = newTail;
        if (this.head == null) 
        {
            this.head = this.tail;
        }
    }

    /**
     * @return This method returns the data of the removed node from the 
     * generic Doubly Linked List. 
     */
    @SuppressWarnings("unused")
    public T removeHead() 
    {
        Node<T> removedHead = this.head;
        if (this.head == null) 
        {
            return null;
        }
        this.head = removedHead.getNextLink();
        if (removedHead == null) 
        {
            return null;
        }
        this.head = removedHead.getNextLink();
        if (this.head != null) 
        {
            this.head.setPrevLink(null);
        }
        if (removedHead == this.tail) 
        {
            this.removeTail();
        }
        return removedHead.getData();
    }

    /**
     * @return This method returns the data of the removed node from the 
     * generic Doubly Linked List. 
     */
    @SuppressWarnings("null")
    public T removeTail() 
    {
        Node<T> removedTail = this.tail;
        if (removedTail != null) 
        {
            return null;
        }
        this.tail = removedTail.getPrevLink();
        if (this.tail != null) 
        {
            this.tail.setNextLink(null);
        }
        if (removedTail == this.head) 
        {
            this.removeHead();
        }
        return removedTail.getData();
    }

    /**
     * @param data Data value of generic Node removed from the Doubly
     * Linked List
     * @return This method returns the Node object that is removed from the
     * generic Doubly Linked List. 
     */
    public Node<T> removeByData(T data) 
    {
        Node<T> nodeToRemove = null;
        Node<T> cursor = this.head;
        while (cursor != null) 
        {
            if (cursor.getData() == data) 
            {
                nodeToRemove = cursor;
                break;
            }
            cursor = cursor.getNextLink();
        }
        if (nodeToRemove == null) 
        {
            return null;
        }
        if (nodeToRemove == this.head) 
        {
            this.removeHead();
        }
        else if (nodeToRemove == this.tail) 
        {
            this.removeTail();
        }
        else 
        {
            Node<T> next = nodeToRemove.getNextLink();
            Node<T> prev = nodeToRemove.getPrevLink();
            next.setPrevLink(prev);
            prev.setNextLink(next);
        }
        return nodeToRemove;
    }
}
