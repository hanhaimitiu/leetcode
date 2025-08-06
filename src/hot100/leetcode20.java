package hot100;

import java.util.*;

public class leetcode20 {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        if(charArray.length%2==1){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for(char c:charArray){
            if(pairs.containsKey(c)){
                if(stack.isEmpty()||stack.peek()!=pairs.get(c)){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
