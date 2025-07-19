// Definition of a binary tree node
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class IdenticalTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, the trees are the same
        if (p == null && q == null) {
            return true;
        }

        // If one of the nodes is null, the trees are not the same
        if (p == null || q == null) {
            return false;
        }

        // If the values of the nodes are different, the trees are not the same
        if (p.data != q.data) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        IdenticalTree solution = new IdenticalTree();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println("Are the trees identical? " + result); 
    }
}
