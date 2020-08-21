package algorithm;

/**
 * 回文
 * @author yuanyang
 * @date 2020/5/14 10:25
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(Integer num){
        if (num < 0 || (num / 10 == 0 && num != 0)){
            return false;
        }
        int revertNum = 0;
        while (num > revertNum){
            revertNum = revertNum * 10 + num % 10;
            num /= 10;
        }
        return revertNum == num || num == revertNum /10;
    }
}
