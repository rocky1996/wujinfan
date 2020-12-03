package tree;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-08
 */
public class Bianli {

    public static void main(String[] args) {
        TreeNode treeNodeG = new TreeNode("G",null,null);
        TreeNode treeNodeF = new TreeNode("F",null,null);
        TreeNode treeNodeE = new TreeNode("E",null,null);
        TreeNode treeNodeD = new TreeNode("D",null,null);
        TreeNode treeNodeC = new TreeNode("C",treeNodeF,treeNodeG);
        TreeNode treeNodeB = new TreeNode("B",treeNodeD,treeNodeE);
        TreeNode treeNodeA = new TreeNode("A",treeNodeB,treeNodeC);

//        //先序
//        xianzuBianli(treeNodeA);

//          //中序
//         zhongxuBianli(treeNodeA);

//        //后序
//        houxuBianli(treeNodeA);

//        //层次遍历,不换行
//        cengciNohuanhang(treeNodeA);

//        //层次遍历,换行
//        cengciAndHuanhang(treeNodeA);

//        //左视图
//        zuoshitu(treeNodeA);

//        //层次打印，倒序
//        System.out.println(cengciBianliAndHuanhangAndDaoxu(treeNodeA));

        //之字形打印
        System.out.println(zhizixingBianli(treeNodeA));
    }

    private static void printNode(TreeNode node){
        System.out.print(node.getData());
    }

    //先序
    private static void xianzuBianli(TreeNode node){
        printNode(node);
        if(node.getLeftNode() != null){
            xianzuBianli(node.getLeftNode());
        }
        if(node.getRightNode() != null){
            xianzuBianli(node.getRightNode());
        }
    }

    //中序
    private static void zhongxuBianli(TreeNode node){
        if(node.getLeftNode() != null){
            zhongxuBianli(node.getLeftNode());
        }
        printNode(node);
        if(node.getRightNode() != null){
            zhongxuBianli(node.getRightNode());
        }
    }

    //后序
    private static void houxuBianli(TreeNode node){
        if(node.getLeftNode() != null){
            houxuBianli(node.getLeftNode());
        }
        if(node.getRightNode() != null){
            houxuBianli(node.getRightNode());
        }
        printNode(node);
    }

    //层次遍历,不换行
    private static void cengciNohuanhang(TreeNode node){
        if(node == null){
            return;
        }

        TreeNode currentNode = null;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.offer(node);

        while(!linkedList.isEmpty()){
            currentNode = linkedList.poll();
            printNode(currentNode);

            if(currentNode.getLeftNode() != null){
                linkedList.offer(currentNode.getLeftNode());
            }
            if(currentNode.getRightNode() != null){
                linkedList.offer(currentNode.getRightNode());
            }
        }
    }

    //层次遍历,换行
    private static void cengciAndHuanhang(TreeNode node){
        if(node == null){
            return;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.offer(node);

        TreeNode currentNode = null;
        TreeNode lastNode = node;
        TreeNode nextLastNode = node;

        while(!linkedList.isEmpty()){
            currentNode = linkedList.poll();
            printNode(currentNode);

            if(currentNode.getLeftNode() != null){
                linkedList.offer(currentNode.getLeftNode());
                nextLastNode = currentNode.getLeftNode();
            }

            if(currentNode.getRightNode() != null){
                linkedList.offer(currentNode.getRightNode());
                nextLastNode = currentNode.getRightNode();
            }

            if(lastNode == currentNode){
                System.out.println();
                lastNode = nextLastNode;
            }
        }
    }

    //左视图
    private static void zuoshitu(TreeNode node){
        if(node == null){
            return;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.offer(node);

        TreeNode currentNode = null;
        TreeNode lastNode = node;
        TreeNode nextLastNode = node;

        Boolean flag = true;

        while(!linkedList.isEmpty()){
            currentNode = linkedList.poll();
            if(flag){
                printNode(currentNode);
                flag = false;
            }


            if(currentNode.getLeftNode() != null){
                linkedList.offer(currentNode.getLeftNode());
                nextLastNode = currentNode.getLeftNode();
            }

            if(currentNode.getRightNode() != null){
                linkedList.offer(currentNode.getRightNode());
                nextLastNode = currentNode.getRightNode();
            }

            if(lastNode == currentNode){
                flag = true;
                System.out.println();
                lastNode = nextLastNode;
            }
        }
    }

    //层次打印,正序or倒序
    private static LinkedList<LinkedList<String>> cengciBianliAndHuanhangAndDaoxu(TreeNode node){
        LinkedList<LinkedList<String>> resList = new LinkedList<LinkedList<String>>();

        if(node == null){
            return resList;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.offer(node);

        TreeNode currentNode = null;

        while(!linkedList.isEmpty()){
            int size = linkedList.size();
            LinkedList<String> listString = new LinkedList<>();
            for(int i=0;i<size;i++){
                currentNode = linkedList.poll();
                listString.add(currentNode.getData());

                if(currentNode.getLeftNode() != null) {
                    linkedList.offer(currentNode.getLeftNode());
                }
                if(currentNode.getRightNode() != null) {
                    linkedList.offer(currentNode.getRightNode());
                }
            }
            resList.addFirst(listString);
        }
        return resList;
    }

    //之字形打印
    private static LinkedList<LinkedList<String>> zhizixingBianli(TreeNode node){
        LinkedList<LinkedList<String>> resList = new LinkedList<>();

        if(node == null){
            return resList;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.offer(node);

        TreeNode currentNode = null;
        boolean flag = true;

        while(!linkedList.isEmpty()){
            int size = linkedList.size();
            LinkedList<String> listString = new LinkedList<>();

            for(int i=0;i<size;i++){
                currentNode = linkedList.poll();
                if(flag){
                    listString.add(currentNode.getData());
                }else {
                    listString.add(0,currentNode.getData());
                }

                if(currentNode.getLeftNode() != null) {
                    linkedList.offer(currentNode.getLeftNode());
                }
                if(currentNode.getRightNode() != null) {
                    linkedList.offer(currentNode.getRightNode());
                }
            }
            resList.add(listString);
            flag = false;
        }
        return resList;
    }
}
