package com;

import javax.crypto.MacSpi;
import javax.xml.transform.Result;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangxin
 * @data 2020/11/26 14:24
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        LambdaDemo3 lambdaDemo3 = new LambdaDemo3();
        lambdaDemo3.test();
    }

    void test(){
        //lambda 表达式进行Map循环
        Map<String,Integer> map = new HashMap();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);


        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

        System.out.println("--------------------------");
        map.forEach((key,value)-> System.out.println("Key:"+key+"Value:"+value));

        System.out.println("-----------------------------------sss");
        String result = null;
        result = map.entrySet().stream().filter(xx->"A".equals(xx.getKey()))
                .map(xx -> xx.getKey())
                .collect(Collectors.joining());

        System.out.println(result);



    }
}
