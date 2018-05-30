import java.util.HashSet;
import java.util.Set;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 11:41
 */
public class MainTest {
    public static void main(String[] args) {
        Set<Object> s = new HashSet<>();
        s.add("number");
        s.add("number");
//        s.add("int");
        System.out.println(s.size());
    }
}
