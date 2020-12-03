package paixu;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-09
 */
public class TestKuaipai {
    public static void main(String[] args) {
        int[] arr =  {5,3,9,1,6};
//        quickSort(arr,0,arr.length-1);
        fun1(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    /**
     *
     * @param arr
     * @param start数组索引开始
     * @param end结束位
     */
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            //分区索引位
            int index = getIndex(arr,start,end);
            quickSort(arr,0,index-1);
            quickSort(arr,index+1,end);
        }
    }

    /**
     * 分区并返回索引值
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int getIndex(int[] arr,int start,int end){
        int i = start;
        int j = end;

        //挖一个坑位
        int x = arr[i];//x是基准数
        while(i<j){
            //先从右向左对比，比小于x的
            while(i<j && arr[j]>=x){
                j--;
            }
            if(i<j){
                //把找到的元素存入第一个坑位
                arr[i] = arr[j];
                i++;
            }

            //从左边向右的
            while(i<j && arr[i]>=x){
                i++;
            }
            if(i<j){
                //把找到的填到上一个坑位
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = x;

        return i;
    }

   private static void fun1(int[] array,int left,int right){
        if(left<right){
            int index = fun2(array,left,right);
            fun1(array,left,index-1);
            fun1(array,index+1,right);
        }
   }

    private static int fun2(int[] array,int left,int right){
        int provn = array[left];

        while(left < right){
            while(left < right && array[right] > provn){
                right--;
            }
            if(left < right){
                array[left++] = array[right];
            }
            while(left < right && array[left] < provn){
                left++;
            }
            if(left < right){
                array[right--] = array[left];
            }
        }
        array[left] = provn;
        return left;
    }
}
