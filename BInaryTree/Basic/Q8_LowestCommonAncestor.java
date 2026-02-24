
import java.util.*;

/*
Lowest Common Ancestor of a Binary Tree
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).
Example 1:
Input: root = [3,5,1,6,2,0,8], p = 5, q = 1
Output: 3  

Approach 1: 
what we will do ? 
    1. stores path from root to both nodes in two different lists.
    2. traverse both lists and find the last common node in both lists. 
Time Complexity: O(n) where n is the number of nodes in the binary tree.
Space Complexity: O(n) where n is the number of nodes in the binary tree.

 */
public class Q8_LowestCommonAncestor {
    static class Node{
            int data;
            Node left, right;
    
            public Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        public static boolean getPath(Node root , int n ,ArrayList<Node> path){
            if(root == null) return false;
            path.add(root);
            if(root.data == n){
                return true;
            }
            boolean leftPath = getPath(root.left, n, path);
            boolean rightPath = getPath(root.right, n, path);
            if(leftPath || rightPath){
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }
        public static Node lca(Node root , int n1 , int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // last common Ancestor
            int i =0 ; 
            for( i = 0 ; i < path1.size() && i < path2.size() ; i++){
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }
            // last equal node => i-1 th node 
            return path1.get(i-1);
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
        Node result = lca(root, 4, 5);
        System.out.println("LCA of 4 and 5: " + result.data);
    }
}