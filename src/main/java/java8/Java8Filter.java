package java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/7/8 16:30
 */
public class Java8Filter {

    public static void main(String[] args) {
        List<User> users = UserUtils.getUserList();
        //过滤出年龄大于20的人
        List<User> result = users.stream().filter(user -> user.getAge() > 20).collect(Collectors.toList());
        result.forEach(user -> System.out.println(user.getAge()));
        //找到名字为张三的人,找到就返回,找不到返回空
        User user = users.stream().filter(user1 -> "张三".equals(user1.getName())).findAny().orElse(null);
        System.out.println("找到的用户为" + user.getName());
    }
}
