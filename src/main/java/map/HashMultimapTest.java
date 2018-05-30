package map;

import com.google.common.collect.HashMultimap;

/**
 * @author yuanyang
 * @Description:
 * @date 2018/5/21 16:04
 */
public class HashMultimapTest {

    public static void main(String[] args) {
        HashMultimap<Integer,Long> maps = HashMultimap.create();
        maps.put(243,191L);
        maps.put(243,192L);
        System.out.println(maps.size());
        for (Integer key : maps.keySet()){
            System.out.println(key);
            System.out.println(maps.get(key));
        }
    }
}
