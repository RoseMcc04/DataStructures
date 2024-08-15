package Java.Trees;

/**
 * @author Rose McCormack
 * @version 2024
 */
public class Tree 
{
    private TreeNode root;

    /**
     * @param root Root node of Tree object
     * @description The no-arg constructor allows us to create a Tree object
     * with an input of a root node. 
     */
    public Tree(TreeNode root) 
    {
        this.root = root;
    }

    /**
     * @description The helper method that will help us with the regular print
     * method. 
     */
    public void print() 
    {
        print(this.root, 0);
    }

    /**
     * @param cursor Current node to start with
     * @param level Amount of tree levels printed
     * @description This method will print out the tree object based on the 
     * amount of levels in the input. 
     */
    public void print(TreeNode cursor, int level) 
    {
        String levelMarks = "";
        for (int i = 0; i < level; i++) 
        {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + cursor.getData());
        for (TreeNode child : cursor.getChildren()) 
        {
            print(child, level + 1);
        }
    }
    // Depth-First Traversal

    /*
     * Display the current tree node's data
     * For each child in children
     *     Call DFS traversal recursively on child
     * 
     * Definition: Technique that visits the first child in the children list
     *             and that node's children recursively before visiting all the
     *             first child's siblings and their children recursively. 
     */
}
