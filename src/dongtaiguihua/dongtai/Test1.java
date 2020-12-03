package dongtaiguihua.dongtai;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 斐波那契数列
 */
public class Test1 {

//    public static void main(String[] args) {
//        System.out.println(jumpFloor(5));
//    }

//    public static int jumpFloor(int n) {
//
//        //但是要注意一点，这里的n值有可能非常巨大，超过了栈的深度，导致StackOverflowError错误，基于
//        if(n <= 0){
//            return -1;
//        }
//
//        if(n == 1 || n == 2){
//            return n;
//        } else {
//            return jumpFloor(n-1) + jumpFloor(n-2);
//        }
//
//        if(n <= 0){
//            return -1;
//        }
//
//        if(n == 1 || n == 2){
//            return n;
//        } else {
//            int one = 1;
//            int two = 2;
//            int result = 0;
//            for(int i=2;i<n;i++){
//                result = one + two;
//                one = two;
//                two = result;
//            }
//            return result;
//        }
//    }

    public static void main(String[] args) {
        System.out.println(jumpFloor2(3));
    }

    public static int jumpFloor2(int n){
        if(n <= 0){
            return -1;
        }

        if(n==1 || n==2){
            return n;
        }else {
            int one = 1;
            int two = 2;
            int result = 0;
            for(int i=2;i<n;i++){
                result = one + two;
                one = two;
                two = result;
            }
            return result;
        }
    }

}
