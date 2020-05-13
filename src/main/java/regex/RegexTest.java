package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanyang
 * @description:
 * @date 2018/10/10 10:42
 */
public class RegexTest {

    public static void main(String[] args) {
        String testStr = "^abc";
        Pattern pattern = Pattern.compile(testStr);
        Matcher matcher = pattern.matcher("abc");

        System.out.println(matcher.matches());
    }
}
