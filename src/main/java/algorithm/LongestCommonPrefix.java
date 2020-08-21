package algorithm;

/**
 * 最长公共子串
 * @author yuanyang
 * @date 2020/5/19 9:24
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] str = {"231","23123"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
