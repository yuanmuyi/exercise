import java8.User;
import utils.JsonUtils;

import java.util.*;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 11:41
 */
public class MainTest {
    public static void main(String[] args) {
//        Map<Integer,List<Integer>> testMap = new HashMap<>();
//        List<Integer> value = new ArrayList<>();
//        value.add(1);
//        testMap.put(1,value);
//        testMap.computeIfAbsent(1,k ->new ArrayList<>(1)).add(2);
//        List<Integer> v2 = testMap.computeIfAbsent(2,k->new ArrayList<>(1));
//        for (Map.Entry<Integer, List<Integer>> map : testMap.entrySet()) {
//            for (Integer integer : map.getValue()) {
//                System.out.println(map.getKey() + ":" + integer);
//            }
//        }


            User vo = new User();
            vo.setName("12313");
            String s = JsonUtils.obj2Json(vo);
            Object o = JsonUtils.json2Obj(s,Object.class);
            User user = (User)o;
            System.out.println(JsonUtils.obj2Json(user));
    }
}
