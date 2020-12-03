package gongsi;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */

/**
 * 1.找出多数元素
 * 2.单例模式
 */
public class Test1 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        int count=0;
        Arrays.sort(array);
        int num=array[len/2];
        for(int i=0;i<len;i++){
            if(num==array[i])
                count++;
        }
        if(count<=(len/2)){
            num=0;
        }
        return num;
    }
}
