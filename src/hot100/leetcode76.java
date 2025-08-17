package hot100;

public class leetcode76 {

    public String minWindow(String s, String t) {
        // 边界条件处理
        if(s==null || t== null ||s.length()<t.length()){
            return "";
        }

        //用于记录目标字符串t中各字符的出现次数
        int []target = new int[128];
        //用于记录当前窗口中各字符的出现次数
        int []windows = new int[128];

        //统计t中每个字符的出现次数
        for(char c:t.toCharArray()){
            target[c]++;
        }

        //计算t中不同字符出现是的数量
        int tunique = 0;
        for (int i : target) {
            if(i>0){
                tunique++;
            }
        }

        int left =0;
        int right =0;
        int valid =0;
        int start = 0;
        int minlen = -1;
        while (right<s.length()){
            char c = s.charAt(right);
            right++;

            if(target[c]>0){
                windows[c]++;
                //窗口内该字符数量以达到目标数量时，valid+1
                if(windows[c]==target[c]){
                    valid++;
                }
            }

            //当窗口包含所有目标字符时，收缩左指针
            while (valid==tunique){
                if(minlen==-1 ||right-left<minlen){
                    start =left;
                    minlen = right-left;
                }

                //左指针移动
                char leftchar = s.charAt(left);
                left++;

                //如果左侧是目标字符，更新窗口计数和valid
                if(target[leftchar]>0){
                    if(windows[leftchar]==target[leftchar]){
                        tunique--;
                    }
                    windows[leftchar]--;
                }
            }
        }

        return minlen==-1?"":s.substring(start,start+minlen);
    }
}
