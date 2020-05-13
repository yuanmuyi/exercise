import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/29 11:41
 */
public class MainTest {
//    public static void main(String[] args) {
//        Map<Integer, List<Integer>> testMap = new HashMap<>();
//        List<Integer> value = new ArrayList<>();
//        value.add(1);
//        testMap.put(1, value);
//        testMap.computeIfAbsent(1, k -> new ArrayList<>(1)).add(2);
//        List<Integer> v2 = testMap.computeIfAbsent(2, k -> new ArrayList<>(1));
//        for (Map.Entry<Integer, List<Integer>> map : testMap.entrySet()) {
//            for (Integer integer : map.getValue()) {
//                System.out.println(map.getKey() + ":" + integer);
//            }
//        }
//
//
//    }

//    public static void main(String[] args) {
//        AtomicInteger atomicInteger = new AtomicInteger(0);
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i1 = 0; i1 < 10; i1++) {
//                        System.out.println(atomicInteger.incrementAndGet());
//                    }
//                }
//            }).start();
//        }
//    }

    public static void main(String[] args) {
//        Map<String,String> result = new HashMap<>(3);
//        Map<String,String> result1 = new HashMap<>(3);
//        result.put("1","1");
//
//        Map<String,String> result2 = new HashMap<>(3);
//        result2.put("1","2");
//        result.putAll(result1);
//        result.putAll(result2);
//
//        System.out.println(result);
        System.out.println(testFinally());

    }

    public static int testFinally(){
        try {
           return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
