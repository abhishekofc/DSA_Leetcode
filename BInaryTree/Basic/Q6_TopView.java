/*
Top View of a Binary Tree => the set of nodes visible when the tree is viewed from the top.

To get top nodes we use the concept of horizontal distance from the root node.
root node => horizontal distance = 0 => x
left child => horizontal distance = horizontal distance of parent - 1 = > x-1
right child => horizontal distance = horizontal distance of parent + 1 => x+1

Time Complexity: O(n) where n is the number of nodes in the tree, as we visit each node once.
Space Complexity: O(n) in the worst case, when the tree is skewed and all nodes are at different horizontal distances.

Approach  : Level Order traversal using a queue and a hashmap to store the first node at each horizontal distance.
Traverse the tree  from min to maximun HD and print the nodes stored in the hashmap.

What we have have in this ?
    1.HashMap
    2.Horizontal Distance
    3.Level Order Traversal
 */

import java.util.*;
public class Q6_TopView{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        Node node;
        int hd; // horizontal distance

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        // Level Oder traversal 
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min =0 , max = 0;
        q.add(new Info(root, 0)); // root node with horizontal distance 0
        q.add(null); // marker for end of level

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()) break ;
                else q.add(null);
            }else{
                if(!map.containsKey(curr.hd)){ // if horizontal distance is not already in the map, add it
                map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd - 1)); // left child has horizontal distance -1
                    min = Math.min(min, curr.hd - 1); // update minimum horizontal distance
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd + 1)); // right child has horizontal distance +1
                    max = Math.max(max, curr.hd + 1); // update maximum horizontal distance
                }
            }
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
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
        topView(root);
    }
}