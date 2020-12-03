package string;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "I am a student";
        System.out.println(function(str));
    }

    public static String function(String str){
//        String[] strings = str.split(" ");
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for(int i=strings.length-1;i>=0;i--){
//            if(i != 0){
//                stringBuilder.append(strings[i]).append(" ");
//            }else {
//                stringBuilder.append(strings[i]);
//            }
//        }
//        return stringBuilder.toString();

        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = strings.length-1;i >= 0;i--){
            if(i != 0){
                stringBuilder.append(strings[i]).append(" ");
            }else {
                stringBuilder.append(strings[i]);
            }
        }
        return stringBuilder.toString();
    }
}
