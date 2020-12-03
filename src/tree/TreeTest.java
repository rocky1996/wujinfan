package tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-08
 */
public class TreeTest {

    private static boolean isSymmetrical(TreeNode node){
        if(node == null){
            return true;
        }
        return isSym(node.getLeftNode(),node.getRightNode());
    }

    private static boolean isSym(TreeNode leftNode,TreeNode rightNode){
        if(leftNode == null || rightNode == null){
            return false;
        }
        if(leftNode == null && rightNode == null){
            return true;
        }
        return isSym(leftNode.getLeftNode(),rightNode.getRightNode()) && isSym(leftNode.getRightNode(),rightNode.getLeftNode());
    }
}
