/*
    Given a binary tree and two nodes, find the k-th ancestor of the lowest common ancestor (LCA) of the two nodes. If the k-th ancestor does not exist, return -1.
    what we have to do ? 
        1.  find my node 
        2. if(root.data == node)return 0;
          Calculate leftDis and rightDis
        3. if(leftDis == -1 && rightDis == -1) return -1;
           else if(leftDis ==-1) return rightDis + 1;
           else return leftDis+1;
*/

public class Q10_kthAncestor{
    static class Node{
            int data;
            Node left, right;
    
            public Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        public static int KAncestor(Node root , int n , int k){
            if(root == null ) return -1;
            if(root.data == n) return 0;
            int leftDis = KAncestor(root.left, n, k);
            int rightDis = KAncestor(root.right, n, k);
            if(leftDis == -1 && rightDis == -1) return -1;
            int max = Math.max(leftDis, rightDis);
            if(max+1 == k){
                System.out.println(root.data);
            }
            return max+1;
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
        int n=5 , k=2 ;
        KAncestor(root, n, k);
    }
}