package java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/7/8 16:48
 */
public class Java8Map {

    public static void main(String[] args) {
        List<User> users = UserUtils.getUserList();
        //取出每个人的名字
        List<String> names = users.stream().map(User::getName).collect(Collectors.toList());
        names.forEach(System.out::println);
        //对每个人的年龄乘以2
        List<Integer> result = users.stream().map(user -> user.getAge()*2).collect(Collectors.toList());

    }
}
