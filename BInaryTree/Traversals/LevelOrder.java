/*
 Level Order Traversal of a Binary Tree
 It prints the nodes of a binary Tree level by level.
 Each level is printed from left to right.
 In This implementation, we use a queue (FIFO) to keep track of nodes at each level.
 we will use Bfs Breadth First Search approach. => Iterative Approach
 TC : linear o(n)
 Space Complexity: O(n) for the queue.

 
 */

import java.util.*;
public class LevelOrder{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1)return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
            
        public static void levelorder(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); // Marker for end of level
            
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    }else{
                        q.add(null); 
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null) q.add(currNode.left);
                    if(currNode.right != null) q.add(currNode.right);
                }
            }
        }
    }
        public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelorder(root);
    }
}









































   