


public class Main {
    public static void main(String[] args) {
        TreeNode example = new TreeNode(1, new TreeNode(null), new TreeNode(2, new TreeNode(), new TreeNode(3)));
        System.out.println(TreeNode.preorderTraversal(example));
    }
}



