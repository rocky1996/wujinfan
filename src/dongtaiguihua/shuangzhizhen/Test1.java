package dongtaiguihua.shuangzhizhen;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 * 双指针
 * 题目描述：在有序数组中找出两个数，使它们的和为 target。
 * 时间复杂度为o(n)
 * 空间复杂度为o(1)
 */
public class Test1 {
    public static void main(String[] args) {
//        int[] arr = {2, 7, 1, 8, 6};
        int[] arr = {1, 2, 6, 7, 8};
        function(arr,9);
    }

    private static void function(int[] array,int target){
        if(array == null){
            return;
        }

        int i = 0;
        int j = array.length-1;
        while(i < j){
            int sum = array[i] + array[j];
            if(sum == target){
                System.out.println(array[i]+","+array[j]);
                i++;
                j--;
            }else if(sum < target){
                i++;
            }else {
                j--;
            }
        }
    }
}
