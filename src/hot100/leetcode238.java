package hot100;

public class leetcode238 {
    public int[] productExceptSelf(int[] nums) {

        int []left =new int[nums.length];
        int []right =new int[nums.length];
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(i==0&&j==nums.length-1){
                left[i]=1;
                right[j]=1;
            }else {
                left[i]=left[i-1]*nums[i-1];
                right[j]=right[j+1]*nums[j+1];
            }
        }
        int []res = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
}
