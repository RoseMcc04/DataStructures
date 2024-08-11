package Java.HashMaps;

/**
 * @author Rose Adrianna
 * @version 2024
 * @param K Generic type for keys
 * @param V Generic type for values
 */
public class Node<K, V> 
{
    private K key;
    private V value;
    private Node<K, V> link;

    /**
     * @param key Generic key for the Node object
     * @param value Generic value for the Node object
     */
    public Node(K key, V value) 
    {
        this.key = key;
        this.value = value;
        this.link = null;
    }

    /**
     * @param link Node that will be linked
     * This method will link the Node calling it to the Node inputted
     */
    public void setLink(Node<K, V> link) 
    {
        this.link = link;
    }

    /**
     * @return This method will return the link of the current Node as a
     * Node object
     */
    public Node<K, V> getLink() 
    {
        return this.link;
    }

    /**
     * @param key Key to be inputted
     * @param value Value to be inputted
     * This method will add a key-value pair as a Node to a LinkedList or 
     * HashMap implementation
     */
    public void set(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }

    /**
     *@return This method returns the key of a key-value pair.
     */
    public K getKey() 
    {
        return this.key;
    }

    /**
     * @return This method return the value of a key-value pair.
     */
    public V getValue() 
    {
        return this.value;
    }
}
