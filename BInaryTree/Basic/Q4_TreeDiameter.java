/*
 Diameter => the no of nodes in the longest path btw 2 leaves in a binary tree.
 Approach 1 : using height function => O(n^2) => for each node we are calculating the height of left and right subtree.
    Case 1 : diameter lies in the left subtree => diameter = diameter of left subtree
    Case 2 : diameter lies in the right subtree => diameter = diameter of right subtree
    Case 3 : diameter passes through the root => diameter = height of left subtree + height of right subtree + 1 (for counting the current node in the diameter calculation)
*/
public class Q4_TreeDiameter {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){
        if(root == null) return 0; 
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfdiam = leftHt + rightHt + 1;
        return Math.max(selfdiam,Math.max(leftDiam,rightDiam));

    }  
/* 

Optimised Approach : using a pair class => O(n) => we will calculate the diameter and height at the same time and return the pair of diameter and height for each node.
    We will create a class Info to store the diameter and height of the subtree rooted at the current node.
    We will return the diameter and height of the subtree rooted at the current node in a single traversal of the tree.
    Time Complexity: O(n) where n is the number of nodes in the tree, as we visit each node once.
    Space Complexity: O(h) where h is the height of the tree, due to the recursive call stack.

    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){

    // Base Case 
        if(root == null) return new Info(0,0);


       Info leftInfo = diameter(root.left);
       Info rightInfo = diameter(root.right);

       int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
       int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
       return new Info(diam, ht);
    
    }
*/

    public static void main (String []args){
        /*
         *           1
         *         /  \
         *        2     3
         *       / \    / \
         *      4  5    6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));

    }

    
}

