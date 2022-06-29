package leetcodeday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangxin
 * @data 2022/6/29 13:46
 */
public class SolutionEighting {
    public List<List<Integer>> forSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1]== nums[i]){
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (right > left){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > right){
                        right--;
                    }else if (sum < target){
                        left++;
                    }else {
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right >left && nums[left] == nums[left + 1]) left++;

                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
