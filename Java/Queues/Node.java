package Java.Queues;

/**
 * @author Rose Adrianna
 * @version 2024
 * @param T Generic type for Node object
 */
public class Node<T> 
{
    private Node<T> nextLink;
    private T data;

    /**
     * This is the no-arg constructor to initialize a generic Node object. 
     */
    public Node() 
    {
        this.data = null;
        this.nextLink = null;
    }

    /**
     * @param data Generic data that the Node will hold
     * This is the one-arg constructor to initialize a generic Node object.
     */
    public Node(T data) 
    {
        this.data = data;
        this.nextLink = null;
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
     * This method will set the next link to the next generic Node. 
     */
    public void setNextLink(Node<T> nextLink) 
    {
        this.nextLink = nextLink;
    }

    /**
     * @return This method returns the link to the next generic Node. 
     */
    public Node<T> getNextLink() 
    {
        return this.nextLink;
    }
}
