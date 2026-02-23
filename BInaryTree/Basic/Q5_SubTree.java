/*
Subtree of another tree
Given the roots of two binary trees root and subRoot, 
return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants.
The tree tree could also be considered as a subtree of itself.
Example 1:
Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true

Hint 
Check for non - identical trees 
1. node.data != subRoot.data => return false
2. node = null || subRoot = null => return false
3. left subtree => Identical or not ?
4. right subtree => Identical or not ?

 */

public class Q5_SubTree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null) return true;
        else if(root == null || subRoot == null || root.data != subRoot.data) return false;

        // check for left and right subtree
        if(!isIdentical(root.left, subRoot.left) || !isIdentical(root.right, subRoot.right)) return false;
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null) return false;
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }

    public static void main(String[] args) {
            /*
                      1
                    /  \
                   2     3
                  / \    / \
                 4  5    6  7
             */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right= new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            /**
                      2
                    /  \
                   4     5
            **/
            Node subRoot = new Node(2);
            subRoot.left = new Node(4);
            subRoot.right = new Node(5);
            System.out.println(isSubtree(root, subRoot));
        }
}