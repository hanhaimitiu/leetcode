package hot100;

import java.util.*;

public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int first =0;first<n;first++){
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            int thrid = n-1;
            int target = -nums[first];
            for(int second = first+1;second<n;second++){
                if(second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }
                while (second<thrid&&nums[second]+nums[thrid]>target){
                    --thrid;
                }
                if(second==thrid){
                    break;
                }
                if(target==nums[second]+nums[thrid]){
                    List<Integer> list =new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[thrid]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}

