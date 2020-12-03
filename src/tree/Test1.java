package tree;

import jdk.nashorn.internal.runtime.JSONFunctions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-08
 */
public class Test1 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode("5");
        TreeNode treeNode2 = new TreeNode("4");
        TreeNode treeNode3 = new TreeNode("6");
        TreeNode treeNode4 = new TreeNode("12");
        TreeNode treeNode5 = new TreeNode("13");
        TreeNode treeNode6 = new TreeNode("6");
        TreeNode treeNode7 = new TreeNode("9");
        TreeNode treeNode8 = new TreeNode("1");
        TreeNode treeNode9 = new TreeNode("5");
        TreeNode treeNode10 = new TreeNode("1");

        treeNode1.setLeftNode(treeNode2);
        treeNode1.setRightNode(treeNode3);
        treeNode2.setLeftNode(treeNode4);
        treeNode4.setLeftNode(treeNode7);
        treeNode4.setRightNode(treeNode8);
        treeNode3.setLeftNode(treeNode5);
        treeNode3.setRightNode(treeNode6);
        treeNode6.setLeftNode(treeNode9);
        treeNode6.setRightNode(treeNode10);

        System.out.println(findPath(treeNode1,22));
    }


//    private static List<List<Integer>> findPath(TreeNode node,int sum){
//        if(node == null){
//            return new ArrayList<>();
//        }
//
//        List<List<Integer>> resList = new ArrayList<>();
//        List<Integer> tempList = new ArrayList<>();
//        dfsFunction(node,sum,tempList,resList);
//        return resList;
//    }
//
//    private static void dfsFunction(TreeNode node,int sum,List<Integer> tempList,List<List<Integer>> resList){
//        if(node.getLeftNode() == null && node.getRightNode() == null) {
//            if(sum == Integer.parseInt(node.getData())){
//                tempList.add(Integer.parseInt(node.getData()));
//                resList.add(new ArrayList<>(tempList));
//                tempList.clear();
//            }
//            return;
//        }else {
//            tempList.add(Integer.parseInt(node.getData()));
//            if(node.getLeftNode() != null){
//                dfsFunction(node.getLeftNode(),sum-Integer.parseInt(node.getData()),new ArrayList<>(tempList),resList);
//            }
//            if(node.getRightNode() != null){
//                dfsFunction(node.getRightNode(),sum-Integer.parseInt(node.getData()),new ArrayList<>(tempList),resList);
//            }
//        }
//
//    }

    private static List<List<Integer>> findPath(TreeNode node,int sum){
        if(node == null){
            return new ArrayList<>();
        }

        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        dfsFunction(node,sum,tempList,resList);
        return resList;
    }

    private static void dfsFunction(TreeNode node,int sum,List<Integer> tempList,List<List<Integer>> resList){
        if(node.getLeftNode() == null && node.getRightNode() == null){
            if(sum == Integer.parseInt(node.getData())){
                tempList.add(Integer.parseInt(node.getData()));
                resList.add(new ArrayList<>(tempList));
                tempList.clear();
            }
        }else {
            tempList.add(Integer.parseInt(node.getData()));
            if(node.getLeftNode() != null){
                dfsFunction(node.getLeftNode(),sum-Integer.parseInt(node.getData()),new ArrayList<>(tempList),resList);
            }
            if(node.getRightNode() != null){
                dfsFunction(node.getRightNode(),sum-Integer.parseInt(node.getData()),new ArrayList<>(tempList),resList);
            }
        }
    }
}
