package algorithm;

/**
 * @author yuanyang
 * @date 2020/5/22 9:45
 */
public class StrStr {

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){return 0;}
        int size1 = needle.length();
        int size2 = haystack.length();
        for(int i = 0; i <= (size2 - size1); i++){
            String str = haystack.substring(i,i+size1);
            if( str.equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
