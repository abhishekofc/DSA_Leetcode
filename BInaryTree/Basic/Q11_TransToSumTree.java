/*
    To convert a binary tree to a sum tree, we can use a post-order traversal approach. We will recursively calculate the sum of the left and right subtrees for each node and update the node's value to the sum of its left and right subtrees. The original value of the node will be returned to be used in the calculation for its parent node.
    The steps to convert a binary tree to a sum tree are as follows:
1. If the current node is null, return 0.   
2. Recursively convert the left subtree and store the sum of the left subtree.
3. Recursively convert the right subtree and store the sum of the right subtree.
4. Store the original value of the current node.
5. Update the current node's value to the sum of the left and right subtree sums.
6. Return the sum of the original value of the current node and the left and right subtree sums to be used in the calculation for its parent node.
    The time complexity of this approach is O(n) since we visit each node exactly once, and the space complexity is O(h) where h is the height of the tree due to the recursive call stack.

 */
public class Q11_TransToSumTree {
    static class Node{
            int data;
            Node left, right;
    
            public Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        public static int toSumTree(Node root){
            if(root == null) return 0;
            int leftSum = toSumTree(root.left);
            int rightSum = toSumTree(root.right);
            int originalValue = root.data;
            root.data = leftSum + rightSum;
            return originalValue + root.data;
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
        toSumTree(root);
    }
}