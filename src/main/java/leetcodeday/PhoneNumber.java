package leetcodeday;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxin
 * @data 2022/6/28 10:05
 */
public class PhoneNumber {

     //设置全局列表存储最终的结果
     List<String> list = new ArrayList<>();

     public List<String> letterCombinations(String digits){
          if (digits == null || digits.length() == 0){
               return list;
          }

          String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
          //迭代处理
          backTracking(digits, numString, 0);

          return list;
     }

     //每次迭代选取一个字符串，所以会设计大量的字符串拼接，选用Stringbuilder更高效
     StringBuilder  temp = new StringBuilder();

     public void backTracking(String digits, String[] numString, int num){
          //遍历全部一次 记录一次得到的字符串
          if (num == digits.length()){
               list.add(temp.toString());
               return;
          }
          //str表示当前num对应的字符串
          String str =  numString[digits.charAt(num) - '0'];
          for (int i = 0; i < str.length(); i++) {
               temp.append(str.charAt(i));
               backTracking(digits,numString,num+1);
               //剔除末尾继续尝试
               temp.deleteCharAt(temp.length() - 1);
          }
     }

     public static void main(String[] args) {

          PhoneNumber phoneNumber = new PhoneNumber();
          List<String> list = phoneNumber.letterCombinations("234");
          System.out.println(list);
     }



}
