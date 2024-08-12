package Java.Stacks;

/**
 * @author Rose McCormack
 * @version 2024
 * @param T Generic type for Stack implementation
 */
public class Stack<T> 
{
    private int size;
    private int maxSize;
    private LinkedList<T> stack;
    private static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;

    /**
     * @description This is the no-arg constructor that initializes a generic 
     * Stack object with the maximum size. 
     */
    public Stack() 
    {
       this(DEFAULT_MAX_SIZE);
    }

    /**
     * @param maxSize Desired capacity of the generic Stack
     * @description This one-arg constructor initializes a Stack object with 
     * a desired size. 
     */
    public Stack(int maxSize) 
    {
        this.size = 0;
        this.maxSize = maxSize;
        this.stack = new LinkedList<T>();
    }

    /**
     * @param data Data added to the stack
     * @description This method will add an item as the head of the underlying
     * Linked List and view the item as the top of the generic Stack.
     */
    public void push(T data) 
    {
        if (this.hasSpace()) 
        {
            this.stack.addToHead(data);
            this.size++;
        }
        else 
        {
            throw new Error("Stack is full!");
        }
    }

    /**
     * @return Returns data of top of generic Stack
     * @description This method returns the data of the top of the generic 
     * Stack and removes the top element.  
     */
    public T pop() 
    {
        if (!this.isEmpty()) 
        {
            T data = this.stack.removeHead();
            this.size--;
            return data;
        }
        else 
        {
            throw new Error("Stack is empty!");
        }
    }

    /**
     * @return Returns data of top of generic Stack
     * @description This method returns the data of the top of the generic 
     * Stack without removing the top element. 
     */
    public T peek() 
    {
        if (!this.isEmpty()) 
        {
            return this.stack.getHead().getData();
        }
        else 
        {
            return null;
        }
    }

    /**
     * @return Returns if there is space in the generic Stack or not
     * @description This methods returns true if there is space in the generic
     * Stack or false if there is not space in the generic Stack. 
     */
    public boolean hasSpace() 
    {
        return this.size < this.maxSize;
    }

    /**
     * @return Returns if the generic Stack is empty or not
     * @description This method returns true if there are nodes in the generic
     * Stack and false if there are no nodes in the generic Stack. 
     */
    public boolean isEmpty() 
    {
        return this.size == 0;
    }
}
