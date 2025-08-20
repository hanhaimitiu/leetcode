package hot100;

import java.util.Enumeration;

public class leetcode240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int []row:matrix){
            int index = search(row,target);
            if(index>=0){
                return true;
            }
        }
        return false;
    }

    private int search(int[] row, int target) {
        int low = 0 ,high = row.length;
        while (low<high){
            int mid = (low+high) /2;
            if (row[mid]==target){
                return mid;
            }else if(row[mid]<target){
                high = mid -1;
            }else {
                low = low +1;
            }
        }

        return -1;
    }
}
