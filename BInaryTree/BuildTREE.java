/* 
Time complexit is O(n)
Space complexity is O(n) for the recursion stack
Steps to build a binary tree:
1. Create a Node class to represent each node in the tree.
2. Create a BinaryTree class with a static method to build the tree.
3. Use a static variable idx to keep track of the current index in the input array.
4. The buildTree method recursively constructs the tree:
   - If the current index points to -1, return null (indicating no node).
   - Otherwise, create a new Node with the current value.
   - Recursively build the left and right subtrees.
 */


public class BuildTREE {
    static class Node{  
        int data;
        Node left;
        Node right;

        Node(int data){              
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes []){
            idx++;
            if(nodes[idx]==-1)return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}






