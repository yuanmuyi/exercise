package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/7/8 17:46
 */
public class Java8GroupBy {

    public static void main(String[] args) {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
        Map<String,Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        result.forEach((k,v) ->{
            System.out.println("k值:" + k + "v值:" + v);
        });

        //倒序输出
        Map<String,Long> finalMap = new LinkedHashMap<>();
        result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));
    }
}
