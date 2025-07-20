/*
 * Diameter => the no of nodes in the longest path btw 2 leaves in a binary tree.
 */
public class TreeDiameter {
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

    // public static int diameter(Node root){
    //     if(root == null) return 0; 
    //     int leftDiam = diameter(root.left);
    //     int leftHt = height(root.left);
    //     int rightDiam = diameter(root.right);
    //     int rightHt = height(root.right);

    //     int selfdiam = leftHt + rightHt + 1;
    //     return Math.max(selfdiam,Math.max(leftDiam,rightDiam));

    // }  

    // Approach 2 : optimized
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
       Info leftInfo = diameter(root.left);
       Info rightInfo = diameter(root.right);
    
    }

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

