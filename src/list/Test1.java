package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */
public class Test1 {

    /**
     * 连续子数组的最大和,:{6,-3,-2,7,-15,1,2,2}
     * @param args
     */
    public static void main(String[] args){
        int[] array = {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(array));
    }

    public static int FindGreatestSumOfSubArray(int[] array){
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<array.length;i++){
//            int sum = 0;
//            for(int j=i;j<array.length;j++){
//                sum += array[j];
//                list.add(sum);
//            }
//        }
//
//        System.out.println(list);
//        if(list.size() == 0){
//            return 0;
//        }
//
//        Collections.sort(list);
//        return list.get(list.size()-1);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum+=array[j];
                list.add(sum);
            }
        }

        if(list.size() == 0){
            return 0;
        }

        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
