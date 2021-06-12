package BZhan;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.VariableElement;
import java.util.Stack;

/**
 * @author wangxin
 * @data 2021/6/12 16:29
 */
public class ValidParenthese {

    public boolean isValid(String s) {

        //判断字符串是否为空
        if (s.isEmpty()){
            return false;
        }

        //声明一个栈
        Stack<Character> stack = new Stack<>();
        //遍历字符串
        for (char ch: s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                //判断栈是不是空
                if (stack.isEmpty()){
                    return false;
                }
                //将栈中元素弹出
                char temp = stack.pop();
                //将遍历到的元素和弹出的元素进行对比
                if (ch == ')'){
                    if (temp != '('){
                        return false;
                    }
                }else if (ch == '}'){
                    if (temp != '{'){
                        return false;
                    }
                }else if (ch == ']'){
                    if (temp != '['){
                        return false;
                    }
                }
            }
        }
        //判断栈中是否含有元素
       return stack.isEmpty()? true : false;
    }

    public static void main(String[] args) {
        ValidParenthese validParenthese = new ValidParenthese();
        boolean valid = validParenthese.isValid("[[{}]]]]");
        System.out.println(valid);
    }
}
