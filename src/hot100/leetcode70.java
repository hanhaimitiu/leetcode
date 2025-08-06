package hot100;

public class leetcode70 {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int i = 1;
        int j = 2;
        int res=0;
        for(int k=3;k<=n;k++){
            res = i+j;
            i = j;
            j= res;
        }
        return res;
    }
}
