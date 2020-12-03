package dongtaiguihua.shuangzhizhen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 *  双指针
 *  题目描述：反转字符串中的元音字符
 *  时间复杂度为o(n)
 *  空间复杂度为o(1)
 *  aeiou
 * */
public class Test2 {

    private static Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        String yuanString = "ayte";
        System.out.println(reverseVowels(yuanString));
    }

    private static String function(String s){
        if(s == null){
            return null;
        }

        int i = 0;
        int j = s.length()-1;
        char[] result = new char[s.length()];

        while(i<=j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!set.contains(ci)){
                result[i] = ci;
                i++;
            }else if(!set.contains(cj)){
                result[j] = cj;
                j--;
            }else {
                result[i] = cj;
                result[j] = ci;
                i++;
                j--;
            }
        }

        return new String(result);
    }

    public static String reverseVowels(String s) {
        if (s == null){
            return null;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] result = new char[s.length()];

        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!set.contains(ci)) {
                result[i] = ci;
                i++;
            } else if (!set.contains(cj)) {
                result[j] = cj;
                j--;
            } else {
                result[i] = cj;
                result[j] = ci;
                i++;
                j--;
            }
        }
        return new String(result);
    }

}

