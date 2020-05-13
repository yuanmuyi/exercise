package algorithm;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yuanyang
 * @description:最大子串
 * @date 2020/4/21 9:40
 */
public class MaxSubString {

    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(maxSubString(s));
    }

    public static int maxSubString(String s){
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, ans = 0;

     while (i < s.length() && j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
