package hot100;

public class leetcode41 {

    public int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0){
            return 1;
        }

        int n= nums.length;
        //数字 i 放到索引 i-1
        // 第一步，将每个数放到它应该在的位置
        for (int i = 0; i < n; i++) {
            //只有数字是正整数且在有效范围内，并且不在正确位置时才交接
            while (nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        // 第二步：检查哪个位置没有对应的数字
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // 如果所有位置都正确，则缺失的是n+1
        return n + 1;
    }
}
