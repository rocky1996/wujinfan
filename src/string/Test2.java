package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 * aabbcdeeddfft ---> bcde
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "aabbcdeeddfft";

        List<String> list = new ArrayList<>();
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<str.length();j++){
//                list.add(str.substring(i,j));
//            }
//        }

        for(int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                list.add(str.substring(i,j));
            }
        }


        String lastString = null;
        int maxSize = 0;

//        for(String string:list){
//            if(!function(string) == true){
//                int length = string.length();
//                if(length > maxSize){
//                    maxSize = length;
//                    lastString = string;
//                }
//            }
//        }

        for(String string:list){
            if(function(string) == true){
                int length = string.length();
                if(length > maxSize){
                    maxSize = length;
                    lastString = string;
                }
            }
        }

        System.out.println(maxSize);
        System.out.println(lastString);
    }

//    public static boolean function(String str){
//        if(str == null){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(str.indexOf(ch) != str.lastIndexOf(ch)){
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean function(String str){
//        if(str == null){
//            return false;
//        }
//
//        Set<Character> sets = new HashSet<>();
//        for(int i=0;i<str.length();i++){
//            sets.add(str.charAt(i));
//        }
//        if(sets.size() == str.length()){
//            return true;
//        }
//        return false;

        if(str == null){
            return false;
        }

        Set<Character> sets = new HashSet<>();
        for(int i=0;i<str.length();i++){
            sets.add(str.charAt(i));
        }

        if(sets.size() == str.length()){
            return true;
        }
        return false;
    }
}
