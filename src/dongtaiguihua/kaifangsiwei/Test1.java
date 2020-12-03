package dongtaiguihua.kaifangsiwei;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 * 设置两个变量pre=0和max=0，分别表示买入股票的时间在数组中的下标和最大利润。遍历数组，如果当前值股票价格比先前价格更低，更新pre；否则考虑更新max。时间复杂度为O(n)。
 */
public class Test1 {

    public static void main(String[] args) {
//        int[] data1 = new int[]{9,11,8,5,7,12,16,14};
//        showMaxDiff(data1);

        int[] data = new int[]{7, 1, 5, 3, 6, 4};
        int[] data2 = new int[]{9,11,8,5,7,12,16,14};
        function2(data2);
    }

    private static void function(int[] data){

        int len = data.length;
        int pre = 0;
        int maxNum = 0;

        for(int i=0;i<len;i++){
            if(data[i] < data[pre]){
                pre = i;
            }else {
                int temp = data[i] - data[pre];
                if(temp > maxNum){
                    maxNum = temp;
                }
            }
        }

        System.out.println("pre:::"+data[pre]);
        System.out.println("maxNum:::"+maxNum);
    }


    private static void function2(int[] data){
        int pre = 0;
        int maxNum = 0;

        for(int i=0;i<data.length;i++){
            if(data[i] < data[pre]){
                pre = i;
            }else {
                int temp = data[i] - data[pre];
                if(temp > maxNum){
                    maxNum = temp;
                }
            }
        }

        System.out.println(data[pre]);
        System.out.println(maxNum);


    }

    public static void showMaxDiff(int[] data){
        if(data==null||data.length<2)
            return ;
        int min = data[0];

        int index_min=0;

        int maxDiff = data[1] - min;

        int index_max=1;

        if(data[1]<min) {
            min = data[1];
            index_min=1;
        }

        for(int i=2;i<data.length;i++){
            if(data[i]-min>maxDiff) {
                maxDiff = data[i]-min;index_max=i;
            }
            if(data[i]<min) {
                min = data[i];index_min=i;
            }
        }


        System.out.println("买入点下标："+data[index_min]);
        System.out.println("出售点下标："+data[index_max]);
        System.out.println("最大收益值："+maxDiff);
    }
}
