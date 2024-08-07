package Java.LinkedLists;

/**
 * @author Rose McCormack
 * @version 2024
 * @param T Generic type for Node class
 */
public class Node<T> 
{
    private Node<T> link;
    private T data;

    /**
     * This is the no-arg constructor to initialize a generic Node object. 
     */
    public Node() 
    {
        this.data = null;
        this.link = null;
    }

    /**
     * @param data Generic data that the Node will hold
     * This is the one-arg constructor to initialize a generic Node object.
     */
    public Node(T data) 
    {
        this.data = data;
        this.link = null;
    }

    /**
     * @param data Data the user wants set in the node
     * This method will set the data for the generic Node that calls it. 
     */
    public void setData(T data) 
    {
        this.data = data;
    }

    /**
     * @return This method returns the data for the generic Node. 
     */
    public T getData() 
    {
        return this.data;
    }
    
    /**
     * @param link Generic node that comes after node calling method
     * This method will set the link to the next generic Node. 
     */
    public void setLink(Node<T> link) 
    {
        this.link = link;
    }

    /**
     * @return This method returns the link to the next generic Node. 
     */
    public Node<T> getLink() 
    {
        return this.link;
    }
}