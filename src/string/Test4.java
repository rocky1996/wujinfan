package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 * aaabbbccc ---> bbbcccaaa
 */
public class Test4 {
    public static void main(String[] args) {
        String str = "aaabbbccc";

//        StringBuilder builder1 = new StringBuilder(str);
//        StringBuilder builder2 = new StringBuilder(str);
//        StringBuilder builderLast = new StringBuilder();
//
//        builder1.delete(0,3);
//        builder2.delete(3,str.length());
//        builderLast.append(builder1.toString()).append(builder2.toString());
//
//        System.out.println(builderLast.toString());

//        StringBuilder builder1 = new StringBuilder(str);
//        StringBuilder builder2 = new StringBuilder(str);
//        StringBuilder lastBuilder = new StringBuilder();
//
//        builder1.delete(0,3);
//        builder2.delete(3,str.length());
//        lastBuilder.append(builder1.toString()).append(builder2.toString());
//        System.out.println(lastBuilder.toString());

        String string1 = "ahuded";
        String string2 = "ahude";
//        System.out.println(string.indexOf("d"));
//        System.out.println(string.lastIndexOf("d"));
        if(fun(string1) == true){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }

    public static boolean fun(String str) {
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
