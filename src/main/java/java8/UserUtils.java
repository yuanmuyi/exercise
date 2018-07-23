package java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/7/8 16:12
 */
public class UserUtils {

    public static List<User> getUserList(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(20);
        user1.setSex(1);

        User user2 = new User();
        user2.setName("李四");
        user2.setAge(30);
        user2.setSex(0);

        User user3 = new User();
        user3.setName("王五");
        user3.setAge(25);
        user3.setSex(1);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
