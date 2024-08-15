package Java.Trees;

import java.util.ArrayList;

/**
 * @author Rose McCormack
 * @version 2024
 */
public class TreeNode
{
    private Object data;
    private ArrayList<TreeNode> children;

    /**
     * @description The no-arg constructor allows us to create a tree object
     * with an input as the root node of the tree. 
     */
    public TreeNode(Object data) 
    {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    /**
     * @param child Node added to the tree structure
     * @description This method allows us to add a child node to the tree
     * depending on its order. 
     */
    public void addChild(TreeNode child) 
    {
        children.add(child);
    }

    /**
     * @param childData Data added as a node to the tree structure
     * @description This method allows us to input a piece of data and add it 
     * as a node to the tree depending on its order. 
     */
    public void addChild(Object childData) 
    {
        children.add(new TreeNode(childData));
    }

    /**
     * @return Returns Array List of children nodes
     * @description This method returns the Array List of children nodes for 
     * each parent node.  
     */
    public ArrayList<TreeNode> getChildren() 
    {
        return this.children;
    }
}
