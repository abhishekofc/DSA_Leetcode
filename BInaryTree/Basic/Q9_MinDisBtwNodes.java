/*  Minimum Distance Between Two Nodes in a Binary Tree
Best way to solve this problem is to find the lowest common ancestor of the two nodes and then calculate the distance from the LCA to each of the nodes. The sum of these two distances will give us the minimum distance between the two nodes.
 */

public class Q9_MinDisBtwNodes {
    static class Node{
            int data;
            Node left, right;
    
            public Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        public static Node lca2(Node root , int n1 , int n2){
            if (root == null) return null;
            if(root.data == n1 || root.data == n2) return root;

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

           // leftLca = val and rightLca = null
            if(rightLca == null) return leftLca;
            if(leftLca == null) return rightLca;
            
            return root;
        }
        public static int lcaDistance(Node root , int n ){
            if(root == null) return -1;
            if(root.data == n) return 0;
            int leftDist = lcaDistance(root.left, n);
            int rightDist = lcaDistance(root.right, n);

            if(leftDist == -1 && rightDist == -1) return -1;
            else if(leftDist ==-1) return rightDist + 1;
            else return leftDist+1;
        }
        public static int minDistance(Node root , int n1 , int n2){
            Node lca = lca2(root, n1, n2);
            int d1 = lcaDistance(lca, n1);
            int d2 = lcaDistance(lca, n2);
            return d1 + d2;

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
        int result = minDistance(root, 4, 6);
        System.out.println("Minimum distance between 4 and 6: " + result);
    }
}