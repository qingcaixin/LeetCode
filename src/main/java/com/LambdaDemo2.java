package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxin
 * @data 2020/11/26 14:17
 */
public class LambdaDemo2 {

    private static List<String> items = new ArrayList<>();

    static {
        items.add("a");
        items.add("b");
        items.add("c");
        items.add("d");
    }

    public static void main(String[] args) {
        items.forEach((item) -> System.out.println(item));

        System.out.println("---------------------------------");

        items.forEach((item)->{
            if ("c".equals(item)){
                System.out.println(item);
            }
        });

        System.out.println("---------------------");
        items.stream().filter(s->s.contains("c")).forEach(p-> System.out.println(p));
    }

}
