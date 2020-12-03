package tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-08
 */
public class TreeNode {
    private String data;
    private TreeNode rightNode;
    private TreeNode leftNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode(String data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode(String data) {
        this.data = data;
    }

    public TreeNode() {
    }
}
