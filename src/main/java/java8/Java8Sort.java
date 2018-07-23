package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/7/8 16:18
 */
public class Java8Sort {

    public static void main(String[] args) {
        List<User> users = UserUtils.getUserList();
        //传统
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        users.forEach(user -> System.out.println("传统排序结果:" + user.getAge()));
        //java8
        Comparator<User> ageComparator = (u1,u2) -> u1.getAge() - u2.getAge();
        users.sort(ageComparator);
        users.forEach(user -> System.out.println("java8排序结果:" + user.getAge()));
        //倒序
        users.sort(ageComparator.reversed());
    }
}
