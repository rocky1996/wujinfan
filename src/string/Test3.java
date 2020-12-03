package string;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
public class Test3 {
    public static void main(String[] args) {
        String str = "google";
        System.out.println(str.charAt(function(str)));
    }

//    public static int function(String str){
//        if(str == null || str.length() == 0){
//            return -1;
//        }
//
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(str.indexOf(ch) == str.lastIndexOf(ch)){
//                return str.indexOf(ch);
//            }
//        }
//        return -1;
//    }

//    public static int function(String str){
//        if(str == null){
//            return -1;
//        }
//
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(str.indexOf(ch) == str.lastIndexOf(ch)){
//                return str.indexOf(ch);
//            }
//        }
//        return -1;
//    }

    private static int function(String str){
//        if(str == null){
//            return -1;
//        }
//
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(str.indexOf(ch) == str.lastIndexOf(ch)){
//                return str.indexOf(ch);
//            }
//        }

        if(str == null){
            return -1;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                return str.indexOf(ch);
            }
        }
        return -1;
    }
}
