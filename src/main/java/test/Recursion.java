package test;

/**
 * @author wangxin
 * @data 2021/6/14 11:05
 */
public class Recursion {

    private static int add(int param) {
        if (param < 100 && param > 0) {
            return param + add(param + 1);
        } else {
            return param;
        }
    }

    // 递归实现10的阶乘
    private static int factorial(int param) {
        if (param < 10 && param > 0) {
            return param * factorial(param + 1);
        } else {
            return param;
        }
    }
}
