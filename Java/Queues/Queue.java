package Java.Queues;

/**
 * @author Rose McCormack
 * @version 2024
 * @param T Generic type for Queue object
 */
public class Queue<T>
{
    private int size;
    private int maxSize;
    private LinkedList<T> queue;
    private static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    
    /**
     * @Description This is the no-arg constructor to initialize a generic 
     * Queue with a default capacity. 
     */
    public Queue() 
    {
        this(DEFAULT_MAX_SIZE);
    }

    /**
     * @param maxSize Desired capacity for a generic Queue object. 
     * @Description This one-arg constructor initializes a maximum capacity 
     * for the generic Queue object. 
     */
    public Queue(int maxSize) 
    {
        this.size = 0;
        this.maxSize = maxSize;
        this.queue = new LinkedList<T>();
    }

    /**
     * @param data Data added to the generic Queue object. 
     * @Description This method takes a generic input and adds it as a node to 
     * the generic queue object.
     */
    public void enqueue(T data) 
    {
        this.queue.addToTail(data);
        this.size++;
    }

    /**
     * @return Data of removed Node
     * @description This method removes the head of the underlying Linked List
     * of the generic Queue and returns its data. 
     */
    public T dequeue() 
    {
        T data = this.queue.removeHead();
        this.size--;
        return data;
    }

    /**
     * @return Returns data of front Node
     * @description This method returns the data of the front of the generic 
     * Queue without removing it from said Queue. 
     */
    public T peek() 
    {
        return this.queue.getHead().getData();
    }

    /**
     * @return Returns if there is space or not
     * @description This method returns a boolean depending on whether the 
     * generic Queue has space or not. 
     */
    public boolean hasSpace() 
    {
        return this.size < this.maxSize;
    }

    /**
     * @return Returns if Queue is empty or not
     * @description This method returns a boolean depending on whether the 
     * generic Queue is empty or not. 
     */
    public boolean isEmpty() 
    {
        return this.size == 0;
    }
}
