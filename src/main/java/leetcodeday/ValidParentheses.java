package leetcodeday;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wangxin
 * @data 2022/7/1 16:22
 */
public class ValidParentheses {
    public boolean isVaild(String s){
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //碰到左括号就把相应的右括号入栈
            if (ch == '('){
                deque.push(')');
            }else if (ch == '{'){
                deque.push('}');
            }else if (ch == '['){
                deque.push(']');
            }else if (deque.isEmpty() || deque.peek() !=ch){
                return false;
            }else {
                //如果是右括号，判断是否与栈顶元素匹配
                deque.pop();
            }
        }
        //最后判断栈中元素是否匹配
        return deque.isEmpty();
    }
}
