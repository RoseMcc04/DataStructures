package Java.HashMaps;

/**
 * @author Rose McCormack
 * @version 2024
 * @param K Generic type for key
 * @param V Generic type for value
 */
public class HashMap<K, V>
{
    private LinkedList<K, V>[] hashMap;

    /**
     * @param size Desired capacity of the generic HashMaP
     */
    @SuppressWarnings("unchecked")
    public HashMap(int size) 
    {
        this.hashMap = (LinkedList<K, V>[]) new LinkedList[size];
        for (int i = 0; i < size; i++) 
        {
            this.hashMap[i] = new LinkedList<K, V>();
        }
    }

    /**
     * @param key Key input to be hashed by the function
     * @return This method returns an index based on the key that is used
     * in the hash function.
     */
    public int hash(K key) 
    {
        int hashCode = 0;
        for (int i = 0; i < key.toString().length(); i++) 
        {
            hashCode += Character.codePointAt(key.toString(), i);
        }
        hashCode %= this.hashMap.length;
        return hashCode;
    }

    /**
     * @param key Key to be assigned in HashMap
     * @param value Value to be assigned in HashMap
     */
    public void assign(K key, V value) 
    {
        int i = this.hash(key);
        LinkedList<K, V> list = this.hashMap[i];
        if (list.getHead() == null) 
        {
            list.addToHead(key, value);
            return;
        }
        Node<K, V> cursor = list.getHead();
        while (cursor != null) 
        {
            if (cursor.getKey() == key) 
            {
                cursor.set(key, value);
            }
            if (cursor.getLink() == null) 
            {
                cursor.setLink(new Node<K, V>(key, value));
                break;
            }
            cursor = cursor.getLink();
        }
    }

    /**
     * @param key Key inputted with value the user wants retrieved
     * @return This method returns the value of the inputted key. 
     */
    public V retrieve(K key) 
    {
        int i = this.hash(key);
        Node<K, V> cursor = this.hashMap[i].getHead();
        while (cursor != null) 
        {
            if (cursor.getKey() == key) 
            {
                return cursor.getValue();
            }
            cursor = cursor.getLink();
        }
        return null;
    } 
}
