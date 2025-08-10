package hot100;

import java.util.*;

public class leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap= new HashMap<>();
        int []keymap =new int[26];
        for (String s : strs) {
            for(char c:s.toCharArray()){
                keymap[c-'a']+=1;
            }
            String key = get_key(keymap);
            if(hashMap.containsKey(key)){
                hashMap.get(key).add(s);
            }else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                hashMap.put(key,list);
            }
            Arrays.fill(keymap, 0);

        }
        List<List<String>> lists = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            lists.add(entry.getValue());
        }

        return lists
    }

    private String get_key(int[] keymap) {
        StringBuilder s= new StringBuilder();
        for(int i=0;i<keymap.length;i++){
            if(keymap[i]!=0){
                s.append('a'+i);
                s.append(keymap[i]);
                s.append("-");
            }
        }
        return s.toString();
    }
}
