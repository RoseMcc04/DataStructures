package Java.LinkedLists;

/**
 * @author Rose McCormack
 * @version 2024
 * @param T Generic type for Node class
 */
public class Node<T> 
{
    private Node<T> prevLink;
    private Node<T> nextLink;
    private T data;

    /**
     * This is the no-arg constructor to initialize a generic Node object. 
     */
    public Node() 
    {
        this.data = null;
        this.prevLink = null;
        this.nextLink = null;
    }

    /**
     * @param data Generic data that the Node will hold
     * This is the one-arg constructor to initialize a generic Node object.
     */
    public Node(T data) 
    {
        this.data = data;
        this.prevLink = null;
        this.nextLink = null;
    }

    /**
     * @param data
     */

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

    /**
     * @param link Generic node that comes before node calling method
     * This method will set the previous link to the previous generic Node. 
     */
    public void setPrevLink(Node<T> prevLink) 
    {
        this.prevLink = prevLink;
    }

    /**
     * @return This method returns the link to the previous generic Node. 
     */
    public Node<T> getPrevLink() 
    {
        return this.prevLink;
    }
}