/*
Given a binary tree, return the values of the nodes at the k-th level of the tree in left-to-right order.
Example 1:
Input: root = [1,2,3,4,5,6,7], k = 3
Output: [4,5,6,7]

Approach 1 : iterative approach => reach level k and prints all the nodes at that level
Approach 2 : recursive approach => keep track of the level and when we reach level k, add the node value to the result list
    What we will do ?
        1. PreOrder traversal => root -> left -> right
        2. Keep track of the level and when we reach level k, add the node value to the result list
 */

public class Q7_KthLevel{
        static class Node{
            int data;
            Node left, right;
    
            public Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    public static void kLevel(Node root , int level , int k ){
        if(root == null) return ;
        if(level == k){
            System.out.print(root.data + " ");
            return ;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }
    public static void main(String[] args){
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
    }
}