package TeaTea;


/**
 * @author wangxin
 * @data 2021/6/6 17:22
 */
public class LC26_RemoveDuplicates {

    public int removeDuplicates(int[] nums){

        while (nums==null || nums.length == 0){
            return 0;
        }
        int p = 0;
        int q = 1;

        while (q < nums.length){
            if (nums[p] != nums[q]){
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }

        return p+1;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4};
        LC26_RemoveDuplicates lc26_removeDuplicates = new LC26_RemoveDuplicates();
        int i = lc26_removeDuplicates.removeDuplicates(nums);
        System.out.println(i);
    }
}
