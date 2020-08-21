package algorithm;

/**
 * 整数翻转
 * @author yuanyang
 * @date 2020/5/13 14:24
 */
public class IntegerReverse {

    public static void main(String[] args) {
        int num = 20160523;
        System.out.println(reverse(num));
    }

    public static int reverse(int num){
        int rev = 0;
        while (num != 0){
            int pop = num % 10;
            num = num / 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)){
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
