package algorithm;

import utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;


public class TwoNumSum {

    public static void main(String[] args) {
        int[] a = {2,5,7,9};
        System.out.println(JsonUtils.obj2Json(getTwoNumSum(a,9)));
    }


    public static int[] getTwoNumSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (map.containsKey(left)){
                return new int[]{map.get(left),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }



}
