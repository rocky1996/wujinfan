package dongtaiguihua.shuangzhizhen;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-09-03
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *  双指针
 *  题目描述：三个数相加等于某个特定值
 * */
public class Test3 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length<3){
            return result;
        }

        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;



        for(int mid=0;mid< nums.length-2;mid++){
            if(nums[mid]>0) break;
//            if(mid == 0 || (mid > 0 && nums[mid] != nums[mid-1])){
                left=mid+1;
                right=nums.length-1;
                while(left<right){
                    if(nums[left]+nums[mid]+nums[right] ==0){
                        result.add(Arrays.asList(nums[mid],nums[left],nums[right]));
                        while (left < right && nums[left] == nums[left+1]) left++;
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(nums[left]+nums[mid]+nums[right]<0){
                        left++;
                    }else if(nums[left]+nums[mid]+nums[right]>0){
                        right--;
                    }
//                }
            }

        }
        return result;
    }
}
