package TeaTea;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangxin
 * @data 2021/6/5 16:41
 */
public class LC01_TwoSum {

    public int[] twoSum(int[] nums, int target){
        int len = nums.length;
        Map<Integer,Integer> hashMap = new HashMap<>(len - 1);
        hashMap.put(nums[0],0);
        for (int i = 1; i < len; i++){
            int another = target - nums[i];
            if (hashMap.containsKey(another)){
                return new int[]{i,hashMap.get(another)};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("NO two sum soluation");
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 0;
        LC01_TwoSum a = new LC01_TwoSum();
        a.twoSum(nums,target);
    }
}
